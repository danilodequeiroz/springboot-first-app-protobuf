package com.retro2000.springbootfirstapp.proto

import com.retro2000.springbootfirstapp.utils.AssertUtils
import com.retro2000.springbootfirstapp.utils.HttpUtils
import org.junit.jupiter.api.Test
import java.io.IOException
import java.io.InputStream

class UserProtoTest {

    @Test
    @Throws(IOException::class)
    fun getSingleUserTest() {
        val responseStream: InputStream = HttpUtils.executeHttpRequest("localhost:8080/user")
        val jsonOutput: String = HttpUtils.convertProtobufMessageStreamToJsonString(responseStream)
        println(jsonOutput)
        AssertUtils.assertResponse(jsonOutput)
    }

}