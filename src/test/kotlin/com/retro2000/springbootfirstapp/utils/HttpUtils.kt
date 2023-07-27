package com.retro2000.springbootfirstapp.utils

import com.googlecode.protobuf.format.JsonFormat
import com.retro2000.springbootfirstapp.protobuf.UserModel
import java.io.IOException
import java.io.InputStream
import java.net.HttpURLConnection
import java.net.URL


object HttpUtils {

    @Throws(IOException::class)
    fun executeHttpRequest(url: String): InputStream {
        val connection: HttpURLConnection = URL("http://localhost:8080/user").openConnection() as HttpURLConnection
        return connection.inputStream
    }

    @Throws(IOException::class)
    fun convertProtobufMessageStreamToJsonString(protobufStream: InputStream): String {
        val jsonFormat = JsonFormat()
        val account: UserModel.User = UserModel.User.parseFrom(protobufStream)
        return jsonFormat.printToString(account)
    }
}