package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rd {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(BiometricPrompt.CryptoObject cryptoObject) {
        long operationHandle;
        operationHandle = cryptoObject.getOperationHandle();
        return operationHandle;
    }

    public static BiometricPrompt.CryptoObject b(long j) {
        return new BiometricPrompt.CryptoObject(j);
    }

    public static final long c(ws wsVar, long j) {
        wx wxVar = (wx) wsVar;
        return moz.ai(j - wxVar.b, 0L, wxVar.a);
    }

    public static final va d(wq wqVar, long j, va vaVar, va vaVar2, va vaVar3) {
        return wqVar.c(j * 1000000, vaVar, vaVar2, vaVar3);
    }

    public static final mnw e(bah bahVar, cex cexVar) {
        if (cexVar.b.compareTo(cew.DESTROYED) > 0) {
            nw nwVar = new nw(bahVar, 2);
            cexVar.a(nwVar);
            return new aqg(cexVar, nwVar, 6, null);
        }
        throw new IllegalStateException("Cannot configure " + bahVar + " to disposeComposition at Lifecycle ON_DESTROY: " + cexVar + "is already destroyed");
    }
}
