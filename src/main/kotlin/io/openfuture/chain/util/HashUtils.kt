package io.openfuture.chain.util

import java.security.MessageDigest

object HashUtils {

	fun generateHash(bytes: ByteArray): String {
		val instance = MessageDigest.getInstance("SHA-256")
		val digest = instance.digest(bytes)
		return digest.fold("", { str, it -> str + "%02x".format(it) })
	}

}
