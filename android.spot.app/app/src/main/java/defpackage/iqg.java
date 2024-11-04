package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Path;
import android.os.Build;
import android.os.Looper;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.google.android.apps.adm.R;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iqg {
    private static kqr a;
    private static Thread b;

    public static int A(int i) {
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static LinkedHashMap B(int i) {
        return new LinkedHashMap(A(i));
    }

    public static List C(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    public static void D(boolean z, String str, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static void E(Object obj) {
        obj.getClass();
    }

    public static void F(Activity activity) {
        if (activity != null) {
        } else {
            throw new IllegalStateException("Attempted use of the activity when it is null");
        }
    }

    public static cgn G(ag agVar, cgn cgnVar) {
        return ((lrd) hzc.ai(agVar, lrd.class)).e().c(cgnVar);
    }

    public static void H() {
        if (b == null) {
            b = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == b) {
        } else {
            throw new IllegalStateException("Must be called on the Main thread.");
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public static lsl I(ktf ktfVar) {
        return new lsl(ktfVar.b);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Map, java.lang.Object] */
    public static lsk J(ktf ktfVar) {
        return new lsk(ktfVar.b);
    }

    private static int K(Context context, TypedValue typedValue) {
        if (typedValue.resourceId != 0) {
            return bqx.c(context, typedValue.resourceId);
        }
        return typedValue.data;
    }

    public static void a(Outline outline, Path path) {
        outline.setConvexPath(path);
    }

    public static int b(int i, int i2) {
        return bro.c(i, (Color.alpha(i) * i2) / 255);
    }

    public static int c(View view, int i) {
        return K(view.getContext(), hzc.p(view.getContext(), i, view.getClass().getCanonicalName()));
    }

    public static int d(Context context, int i, int i2) {
        Integer h = h(context, i);
        if (h != null) {
            return h.intValue();
        }
        return i2;
    }

    public static int e(Context context, int i, String str) {
        return K(context, hzc.p(context, i, str));
    }

    public static int f(int i, int i2, float f) {
        return bro.b(bro.c(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static ColorStateList g(Context context, int i) {
        TypedValue o = hzc.o(context, i);
        if (o != null) {
            if (o.resourceId != 0) {
                return bqx.e(context, o.resourceId);
            }
            if (o.data != 0) {
                return ColorStateList.valueOf(o.data);
            }
            return null;
        }
        return null;
    }

    public static Integer h(Context context, int i) {
        TypedValue o = hzc.o(context, i);
        if (o != null) {
            return Integer.valueOf(K(context, o));
        }
        return null;
    }

    public static boolean i(int i) {
        double pow;
        double pow2;
        double pow3;
        if (i != 0) {
            double[] dArr = (double[]) bro.a.get();
            if (dArr == null) {
                dArr = new double[3];
                bro.a.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d = red / 255.0d;
                if (d < 0.04045d) {
                    pow = d / 12.92d;
                } else {
                    pow = Math.pow((d + 0.055d) / 1.055d, 2.4d);
                }
                double[] dArr2 = dArr;
                double d2 = green / 255.0d;
                if (d2 < 0.04045d) {
                    pow2 = d2 / 12.92d;
                } else {
                    pow2 = Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                }
                double d3 = blue / 255.0d;
                if (d3 < 0.04045d) {
                    pow3 = d3 / 12.92d;
                } else {
                    pow3 = Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                }
                dArr2[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
                double d4 = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
                dArr2[1] = d4;
                dArr2[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
                if (d4 / 100.0d > 0.5d) {
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        return false;
    }

    public static void j(Window window, boolean z) {
        bqs bybVar;
        window.getDecorView();
        if (Build.VERSION.SDK_INT >= 35) {
            bybVar = new byf(window);
        } else if (Build.VERSION.SDK_INT >= 30) {
            bybVar = new bye(window);
        } else if (Build.VERSION.SDK_INT >= 26) {
            bybVar = new byd(window);
        } else if (Build.VERSION.SDK_INT >= 23) {
            bybVar = new byc(window);
        } else {
            bybVar = new byb(window);
        }
        bqt.d(z, bybVar);
    }

    public static int k(int i, Context context) {
        return new iqi(context).a(d(context, R.attr.colorSurface, 0), context.getResources().getDimension(i));
    }

    public static String l(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static Context m(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            return applicationContext;
        }
        return context;
    }

    public static String n(String str) {
        return "update.precondition.failures:".concat(str);
    }

    public static synchronized kqr o(Context context) {
        kqr kqrVar;
        synchronized (iqg.class) {
            if (a == null) {
                a = new kqr(new jck(m(context), (byte[]) null));
            }
            kqrVar = a;
        }
        return kqrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:            if (((r0 & 1) & r3) != 0) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:            if (r1 > 0) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:            if (r5 > 0) goto L93;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:            if (r5 < 0) goto L93;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x001c. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int p(int r5, int r6, java.math.RoundingMode r7) {
        /*
            r7.getClass()
            if (r6 == 0) goto L4f
            int r0 = r5 / r6
            int r1 = r6 * r0
            int r1 = r5 - r1
            if (r1 != 0) goto Le
            goto L4e
        Le:
            r5 = r5 ^ r6
            int[] r2 = defpackage.jvg.a
            int r3 = r7.ordinal()
            r2 = r2[r3]
            int r5 = r5 >> 31
            r3 = 1
            r5 = r5 | r3
            r4 = 0
            switch(r2) {
                case 1: goto L4b;
                case 2: goto L4e;
                case 3: goto L47;
                case 4: goto L49;
                case 5: goto L44;
                case 6: goto L25;
                case 7: goto L25;
                case 8: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L25:
            int r1 = java.lang.Math.abs(r1)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 - r1
            int r1 = r1 - r6
            if (r1 != 0) goto L41
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_UP
            if (r7 == r6) goto L49
            java.math.RoundingMode r6 = java.math.RoundingMode.HALF_EVEN
            if (r7 != r6) goto L3a
            goto L3b
        L3a:
            r3 = 0
        L3b:
            r6 = r0 & 1
            r6 = r6 & r3
            if (r6 == 0) goto L4e
            goto L49
        L41:
            if (r1 <= 0) goto L4e
            goto L49
        L44:
            if (r5 <= 0) goto L4e
            goto L49
        L47:
            if (r5 >= 0) goto L4e
        L49:
            int r0 = r0 + r5
            return r0
        L4b:
            defpackage.iqh.w(r4)
        L4e:
            return r0
        L4f:
            java.lang.ArithmeticException r5 = new java.lang.ArithmeticException
            java.lang.String r6 = "/ by zero"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqg.p(int, int, java.math.RoundingMode):int");
    }

    public static int q(int i, int i2) {
        return iqh.o(i + i2);
    }

    public static ljh r(Throwable th) {
        StackTraceElement[] stackTraceElementArr;
        ljh k = jvc.e.k();
        ljh k2 = jva.f.k();
        String name = th.getClass().getName();
        if (!k2.b.y()) {
            k2.t();
        }
        jva jvaVar = (jva) k2.b;
        name.getClass();
        jvaVar.a |= 1;
        jvaVar.b = name;
        if (th.getMessage() != null) {
            String message = th.getMessage();
            if (!k2.b.y()) {
                k2.t();
            }
            jva jvaVar2 = (jva) k2.b;
            message.getClass();
            jvaVar2.a |= 2;
            jvaVar2.c = message;
        }
        try {
            stackTraceElementArr = th.getStackTrace();
        } catch (NullPointerException unused) {
            stackTraceElementArr = null;
        }
        if (stackTraceElementArr != null) {
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                ljh k3 = juz.f.k();
                if (stackTraceElement != null) {
                    String className = stackTraceElement.getClassName();
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    juz juzVar = (juz) k3.b;
                    className.getClass();
                    juzVar.a |= 1;
                    juzVar.b = className;
                    String methodName = stackTraceElement.getMethodName();
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    juz juzVar2 = (juz) k3.b;
                    methodName.getClass();
                    juzVar2.a |= 2;
                    juzVar2.c = methodName;
                    int lineNumber = stackTraceElement.getLineNumber();
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    juz juzVar3 = (juz) k3.b;
                    juzVar3.a |= 8;
                    juzVar3.e = lineNumber;
                    if (stackTraceElement.getFileName() != null) {
                        String fileName = stackTraceElement.getFileName();
                        if (!k3.b.y()) {
                            k3.t();
                        }
                        juz juzVar4 = (juz) k3.b;
                        fileName.getClass();
                        juzVar4.a |= 4;
                        juzVar4.d = fileName;
                    }
                }
                if (!k2.b.y()) {
                    k2.t();
                }
                jva jvaVar3 = (jva) k2.b;
                juz juzVar5 = (juz) k3.q();
                juzVar5.getClass();
                ljv ljvVar = jvaVar3.e;
                if (!ljvVar.c()) {
                    jvaVar3.e = ljn.p(ljvVar);
                }
                jvaVar3.e.add(juzVar5);
            }
        }
        if (!k.b.y()) {
            k.t();
        }
        jvc jvcVar = (jvc) k.b;
        jva jvaVar4 = (jva) k2.q();
        jvaVar4.getClass();
        jvcVar.b = jvaVar4;
        jvcVar.a |= 1;
        return k;
    }

    public static int s(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case 17:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case android.support.design.widget.R.styleable.TextInputLayout_cursorColor /* 24 */:
                return 25;
            case android.support.design.widget.R.styleable.TextInputLayout_cursorErrorColor /* 25 */:
                return 26;
            case android.support.design.widget.R.styleable.TextInputLayout_endIconCheckable /* 26 */:
                return 27;
            case android.support.design.widget.R.styleable.TextInputLayout_endIconContentDescription /* 27 */:
                return 28;
            case android.support.design.widget.R.styleable.TextInputLayout_endIconDrawable /* 28 */:
                return 29;
            case android.support.design.widget.R.styleable.TextInputLayout_endIconMinSize /* 29 */:
                return 30;
            case android.support.design.widget.R.styleable.TextInputLayout_endIconMode /* 30 */:
                return 31;
            case android.support.design.widget.R.styleable.TextInputLayout_endIconScaleType /* 31 */:
                return 32;
            case android.support.design.widget.R.styleable.TextInputLayout_endIconTint /* 32 */:
                return 33;
            case android.support.design.widget.R.styleable.TextInputLayout_endIconTintMode /* 33 */:
                return 34;
            case android.support.design.widget.R.styleable.TextInputLayout_errorAccessibilityLiveRegion /* 34 */:
                return 35;
            case 35:
                return 36;
            case android.support.design.widget.R.styleable.TextInputLayout_errorEnabled /* 36 */:
                return 37;
            case android.support.design.widget.R.styleable.TextInputLayout_errorIconDrawable /* 37 */:
                return 38;
            case android.support.design.widget.R.styleable.TextInputLayout_errorIconTint /* 38 */:
                return 39;
            case android.support.design.widget.R.styleable.TextInputLayout_errorIconTintMode /* 39 */:
                return 40;
            case android.support.design.widget.R.styleable.TextInputLayout_errorTextAppearance /* 40 */:
                return 41;
            case android.support.design.widget.R.styleable.TextInputLayout_errorTextColor /* 41 */:
                return 42;
            case android.support.design.widget.R.styleable.TextInputLayout_expandedHintEnabled /* 42 */:
            case android.support.design.widget.R.styleable.TextInputLayout_helperText /* 43 */:
            case android.support.design.widget.R.styleable.TextInputLayout_helperTextEnabled /* 44 */:
            default:
                return 0;
            case android.support.design.widget.R.styleable.TextInputLayout_helperTextTextAppearance /* 45 */:
                return 46;
            case android.support.design.widget.R.styleable.TextInputLayout_helperTextTextColor /* 46 */:
                return 47;
            case android.support.design.widget.R.styleable.TextInputLayout_hintAnimationEnabled /* 47 */:
                return 48;
            case android.support.design.widget.R.styleable.TextInputLayout_hintEnabled /* 48 */:
                return 49;
            case android.support.design.widget.R.styleable.TextInputLayout_hintTextAppearance /* 49 */:
                return 50;
        }
    }

    public static void t(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
            } else {
                throw new IOException("Unable to create parent directories of ".concat(file.toString()));
            }
        }
    }

    public static jer u(jro jroVar, jro jroVar2) {
        try {
            jro c = jro.c(jroVar, jroVar2);
            jro g = jro.g(jroVar2, jroVar);
            jro jroVar3 = new jro(jrj.a(c.c, g.d).b(jrj.a(c.d, g.c)).doubleValue(), jrj.a(c.d, g.b).b(jrj.a(c.b, g.d)).doubleValue(), jrj.a(c.b, g.c).b(jrj.a(c.c, g.b)).doubleValue());
            if (!x(jroVar3)) {
                double A = jvx.A(Math.abs(jroVar3.b), Math.abs(jroVar3.c), Math.abs(jroVar3.d));
                jroVar3 = new jro(jroVar3.b / A, jroVar3.c / A, jroVar3.d / A);
            }
            if (!jroVar3.h(jro.a) && x(jroVar3)) {
                return jer.i(jroVar3);
            }
            return jdl.a;
        } catch (ArithmeticException unused) {
            return jdl.a;
        }
    }

    public static jro v(jro jroVar) {
        if (x(jroVar)) {
            return jroVar;
        }
        return jro.e(jroVar, Math.pow(2.0d, (-1) - Math.getExponent(jvx.A(Math.abs(jroVar.b), Math.abs(jroVar.c), Math.abs(jroVar.d)))));
    }

    public static jro w(jro jroVar, jro jroVar2) {
        double d = jroVar2.b;
        if (d == 0.0d && jroVar2.c == 0.0d) {
            double d2 = jroVar2.d;
            if (d2 == 0.0d) {
                double d3 = jroVar.b;
                if (d3 == 0.0d && jroVar.c == 0.0d) {
                    d2 = 1.0d;
                } else {
                    return new jro(jroVar.c, -d3, 0.0d);
                }
            }
            return new jro(d2, 0.0d, 0.0d);
        }
        return new jro(-jroVar2.c, d, 0.0d);
    }

    public static boolean x(jro jroVar) {
        if (jvx.A(Math.abs(jroVar.b), Math.abs(jroVar.c), Math.abs(jroVar.d)) < Math.pow(2.0d, -242.0d)) {
            return false;
        }
        return true;
    }

    public static /* synthetic */ BigDecimal y(BigDecimal bigDecimal) {
        if (bigDecimal.signum() == 0) {
            return new BigDecimal(BigInteger.ZERO, 0);
        }
        return bigDecimal.stripTrailingZeros();
    }

    public static void z(Object obj, Class cls) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
        }
    }
}
