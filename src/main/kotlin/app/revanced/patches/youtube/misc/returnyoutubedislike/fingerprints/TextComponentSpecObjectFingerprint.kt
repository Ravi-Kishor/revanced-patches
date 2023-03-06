package app.revanced.patches.youtube.misc.returnyoutubedislike.fingerprints

import app.revanced.patcher.extensions.or
import app.revanced.patcher.fingerprint.method.impl.MethodFingerprint
import org.jf.dexlib2.AccessFlags
import org.jf.dexlib2.Opcode

object TextComponentSpecObjectFingerprint : MethodFingerprint(
    returnType = "V",
    access = AccessFlags.PROTECTED or AccessFlags.FINAL,
    parameters = listOf("L"),
    opcodes = listOf(
        Opcode.INVOKE_STATIC_RANGE,
        Opcode.MOVE_RESULT_OBJECT,
        Opcode.INVOKE_DIRECT
    )
)