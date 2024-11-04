package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ra {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Signature d(BiometricPrompt.CryptoObject cryptoObject) {
        Signature signature;
        signature = cryptoObject.getSignature();
        return signature;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Cipher e(BiometricPrompt.CryptoObject cryptoObject) {
        Cipher cipher;
        cipher = cryptoObject.getCipher();
        return cipher;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Mac f(BiometricPrompt.CryptoObject cryptoObject) {
        Mac mac;
        mac = cryptoObject.getMac();
        return mac;
    }

    public static float g(mnb mnbVar) {
        float f;
        apa apaVar = (apa) mnbVar.get(apa.a);
        if (apaVar != null) {
            f = apaVar.a();
        } else {
            f = 1.0f;
        }
        if (f < 0.0f) {
            qz.g("negative scale factor");
        }
        return f;
    }

    public static void h(ut utVar, uv uvVar) {
        uvVar.b(utVar.a());
        va vaVar = uvVar.a;
        va vaVar2 = utVar.d;
        int b = vaVar.b();
        for (int i = 0; i < b; i++) {
            vaVar.e(i, vaVar2.a(i));
        }
        uvVar.c = utVar.f;
        uvVar.b = utVar.e;
        uvVar.d = utVar.b();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 2, list:
          (r8v0 ?? I:java.lang.Object) from 0x00c2: IPUT (r8v0 ?? I:java.lang.Object), (r13v3 ?? I:mpn) A[Catch: CancellationException -> 0x0106, TRY_LEAVE] (LINE:195) mpn.a java.lang.Object
          (r8v0 ?? I:ut) from 0x00bf: INVOKE (r8v0 ?? I:ut), (r24v0 ?? I:long), (r4v1 ?? I:float), (r23v0 ?? I:wa), (r22v0 ?? I:uv), (r26v0 ?? I:moh) STATIC call: ra.j(ut, long, float, wa, uv, moh):void A[Catch: CancellationException -> 0x0106, MD:(ut, long, float, wa, uv, moh):void (m)] (LINE:192)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public static java.lang.Object i(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v0 ??, still in use, count: 2, list:
          (r8v0 ?? I:java.lang.Object) from 0x00c2: IPUT (r8v0 ?? I:java.lang.Object), (r13v3 ?? I:mpn) A[Catch: CancellationException -> 0x0106, TRY_LEAVE] (LINE:195) mpn.a java.lang.Object
          (r8v0 ?? I:ut) from 0x00bf: INVOKE (r8v0 ?? I:ut), (r24v0 ?? I:long), (r4v1 ?? I:float), (r23v0 ?? I:wa), (r22v0 ?? I:uv), (r26v0 ?? I:moh) STATIC call: ra.j(ut, long, float, wa, uv, moh):void A[Catch: CancellationException -> 0x0106, MD:(ut, long, float, wa, uv, moh):void (m)] (LINE:192)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:72)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:54)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r22v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        */

    public static void j(ut utVar, long j, float f, wa waVar, uv uvVar, moh mohVar) {
        long j2;
        if (f == 0.0f) {
            j2 = waVar.a();
        } else {
            j2 = ((float) (j - utVar.a)) / f;
        }
        utVar.e = j;
        utVar.c.h(waVar.c(j2));
        utVar.d = waVar.b(j2);
        if (qg.c(waVar, j2)) {
            utVar.f = utVar.e;
            utVar.c();
        }
        h(utVar, uvVar);
        mohVar.a(utVar);
    }

    private static Object k(wa waVar, moh mohVar, mmx mmxVar) {
        if (waVar.a.e()) {
            return qt.b(mohVar, mmxVar);
        }
        return adl.b(new oq(mohVar, 10), mmxVar);
    }

    public static BiometricPrompt.CryptoObject l(Signature signature) {
        return new BiometricPrompt.CryptoObject(signature);
    }

    public static BiometricPrompt.CryptoObject m(Cipher cipher) {
        return new BiometricPrompt.CryptoObject(cipher);
    }

    public static BiometricPrompt.CryptoObject n(Mac mac) {
        return new BiometricPrompt.CryptoObject(mac);
    }
}
