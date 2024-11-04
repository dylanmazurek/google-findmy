package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.hardware.biometrics.BiometricPrompt;
import android.security.identity.PresentationSession;
import androidx.compose.ui.platform.TestTagElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rc {
    public static BiometricPrompt.CryptoObject a(PresentationSession presentationSession) {
        return new BiometricPrompt.CryptoObject(presentationSession);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PresentationSession b(BiometricPrompt.CryptoObject cryptoObject) {
        PresentationSession presentationSession;
        presentationSession = cryptoObject.getPresentationSession();
        return presentationSession;
    }

    public static va c(wq wqVar, va vaVar, va vaVar2, va vaVar3) {
        return wqVar.d(wqVar.a(vaVar, vaVar2, vaVar3), vaVar, vaVar2, vaVar3);
    }

    public static final aox d(aox aoxVar, String str) {
        return aoxVar.a(new TestTagElement(str));
    }

    public static final boolean e(arf arfVar, float f, float f2) {
        if (arfVar instanceof ard) {
            aql aqlVar = ((ard) arfVar).a;
            if (aqlVar.b <= f && f < aqlVar.d && aqlVar.c <= f2 && f2 < aqlVar.e) {
                return true;
            }
        } else if (arfVar instanceof are) {
            aqm aqmVar = ((are) arfVar).a;
            if (f >= aqmVar.a && f < aqmVar.c && f2 >= aqmVar.b && f2 < aqmVar.d) {
                if (aqi.a(aqmVar.e) + aqi.a(aqmVar.f) <= aqmVar.b()) {
                    if (aqi.a(aqmVar.h) + aqi.a(aqmVar.g) <= aqmVar.b()) {
                        if (aqi.b(aqmVar.e) + aqi.b(aqmVar.h) <= aqmVar.a()) {
                            if (aqi.b(aqmVar.f) + aqi.b(aqmVar.g) <= aqmVar.a()) {
                                float a = aqi.a(aqmVar.e) + aqmVar.a;
                                float b = aqi.b(aqmVar.e) + aqmVar.b;
                                float a2 = aqmVar.c - aqi.a(aqmVar.f);
                                float b2 = aqi.b(aqmVar.f) + aqmVar.b;
                                float a3 = aqmVar.c - aqi.a(aqmVar.g);
                                float b3 = aqmVar.d - aqi.b(aqmVar.g);
                                float b4 = aqmVar.d - aqi.b(aqmVar.h);
                                float a4 = aqi.a(aqmVar.h) + aqmVar.a;
                                if (f < a && f2 < b) {
                                    return f(f, f2, aqmVar.e, a, b);
                                }
                                if (f < a4 && f2 > b4) {
                                    return f(f, f2, aqmVar.h, a4, b4);
                                }
                                if (f > a2 && f2 < b2) {
                                    return f(f, f2, aqmVar.f, a2, b2);
                                }
                                if (f <= a3 || f2 <= b3) {
                                    return true;
                                }
                                return f(f, f2, aqmVar.g, a3, b3);
                            }
                        }
                    }
                }
                aqt aqtVar = new aqt(null);
                jy.e(aqtVar, aqmVar);
                return g(aqtVar, f, f2);
            }
        } else {
            if (arfVar instanceof arc) {
                throw null;
            }
            throw new mku();
        }
        return false;
    }

    private static final boolean f(float f, float f2, long j, float f3, float f4) {
        float a = aqi.a(j);
        float b = aqi.b(j);
        float f5 = f2 - f4;
        float f6 = f - f3;
        if (((f6 * f6) / (a * a)) + ((f5 * f5) / (b * b)) <= 1.0f) {
            return true;
        }
        return false;
    }

    private static final boolean g(arg argVar, float f, float f2) {
        Path.Op op;
        aql aqlVar = new aql(f - 0.005f, (-0.005f) + f2, f + 0.005f, f2 + 0.005f);
        aqt aqtVar = new aqt(null);
        if (!Float.isNaN(aqlVar.b) && !Float.isNaN(aqlVar.c) && !Float.isNaN(aqlVar.d) && !Float.isNaN(aqlVar.e)) {
            if (aqtVar.b == null) {
                aqtVar.b = new RectF();
            }
            RectF rectF = aqtVar.b;
            rectF.getClass();
            rectF.set(aqlVar.b, aqlVar.c, aqlVar.d, aqlVar.e);
            Path path = aqtVar.a;
            RectF rectF2 = aqtVar.b;
            rectF2.getClass();
            path.addRect(rectF2, Path.Direction.CCW);
            aqt aqtVar2 = new aqt(null);
            if (a.m(1, 0)) {
                op = Path.Op.DIFFERENCE;
            } else if (a.m(1, 1)) {
                op = Path.Op.INTERSECT;
            } else if (a.m(1, 4)) {
                op = Path.Op.REVERSE_DIFFERENCE;
            } else if (a.m(1, 2)) {
                op = Path.Op.UNION;
            } else {
                op = Path.Op.XOR;
            }
            aqtVar2.a.op(((aqt) argVar).a, aqtVar.a, op);
            boolean isEmpty = aqtVar2.a.isEmpty();
            aqtVar2.a();
            aqtVar.a();
            if (!isEmpty) {
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Invalid rectangle, make sure no value is NaN");
    }
}
