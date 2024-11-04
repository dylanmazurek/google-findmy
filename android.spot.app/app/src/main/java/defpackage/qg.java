package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qg {
    public static BiometricPrompt.AuthenticationCallback a(qi qiVar) {
        return new qf(qiVar);
    }

    public static BiometricPrompt.CryptoObject b(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        cryptoObject = authenticationResult.getCryptoObject();
        return cryptoObject;
    }

    public static boolean c(wa waVar, long j) {
        if (j >= waVar.a()) {
            return true;
        }
        return false;
    }

    public static final aow d(aiu aiuVar) {
        if (aiuVar != null && !aiuVar.l()) {
            return (aow) aiuVar.b(aiuVar.b - 1);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ayj e(aow aowVar) {
        if ((aowVar.l & 2) != 0) {
            if (aowVar instanceof ayj) {
                return (ayj) aowVar;
            }
            if (aowVar instanceof axx) {
                aow aowVar2 = ((axx) aowVar).d;
                while (aowVar2 != 0) {
                    if (aowVar2 instanceof ayj) {
                        return (ayj) aowVar2;
                    }
                    if ((aowVar2 instanceof axx) && (aowVar2.l & 2) != 0) {
                        aowVar2 = ((axx) aowVar2).d;
                    } else {
                        aowVar2 = aowVar2.o;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final ayr f(axw axwVar) {
        azq azqVar = axwVar.bX().q;
        if (azqVar != null) {
            return azqVar.q;
        }
        ll.h("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw new mks();
    }

    public static final azq g(axw axwVar, int i) {
        azq azqVar = axwVar.bX().q;
        azqVar.getClass();
        if (azqVar.v() == axwVar && azr.g(i)) {
            azq azqVar2 = azqVar.t;
            azqVar2.getClass();
            return azqVar2;
        }
        return azqVar;
    }

    public static final void h(aiu aiuVar, aow aowVar) {
        aiu n = f(aowVar).n();
        int i = n.b;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = n.a;
            do {
                aiuVar.o(((ayr) objArr[i2]).n.e);
                i2--;
            } while (i2 >= 0);
        }
    }

    public static final baw i(axw axwVar) {
        baw bawVar = f(axwVar).t;
        if (bawVar != null) {
            return bawVar;
        }
        ll.h("This node does not have an owner.");
        throw new mks();
    }
}
