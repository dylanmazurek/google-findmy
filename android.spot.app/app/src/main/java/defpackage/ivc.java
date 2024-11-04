package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ivc {
    public ivc() {
    }

    public static Executor A(Executor executor, jwq jwqVar) {
        executor.getClass();
        if (executor == jxv.a) {
            return executor;
        }
        return new jze(executor, jwqVar, 0);
    }

    public static jyz B(Iterable iterable) {
        return new jxq(jis.n(iterable), true);
    }

    public static jyz C() {
        jyt jytVar = jyt.a;
        if (jytVar != null) {
            return jytVar;
        }
        return new jyt();
    }

    public static jyz D(Throwable th) {
        th.getClass();
        return new jyu(th);
    }

    public static jyz E(Object obj) {
        if (obj == null) {
            return jyv.a;
        }
        return new jyv(obj);
    }

    public static jyz F(jyz jyzVar) {
        if (jyzVar.isDone()) {
            return jyzVar;
        }
        jyo jyoVar = new jyo(jyzVar);
        jyzVar.c(jyoVar, jxv.a);
        return jyoVar;
    }

    public static jyz G(jxc jxcVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        jzt jztVar = new jzt(jxcVar);
        jztVar.c(new jxe(scheduledExecutorService.schedule(jztVar, j, timeUnit), 3), jxv.a);
        return jztVar;
    }

    public static jyz H(Runnable runnable, Executor executor) {
        jzt e = jzt.e(runnable, null);
        executor.execute(e);
        return e;
    }

    public static jyz I(Callable callable, Executor executor) {
        jzt jztVar = new jzt(callable);
        executor.execute(jztVar);
        return jztVar;
    }

    public static jyz J(jxc jxcVar, Executor executor) {
        jzt jztVar = new jzt(jxcVar);
        executor.execute(jztVar);
        return jztVar;
    }

    public static jyz K(Iterable iterable) {
        return new jxq(jis.n(iterable), false);
    }

    public static jyz L(jyz jyzVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (jyzVar.isDone()) {
            return jyzVar;
        }
        jzq jzqVar = new jzq(jyzVar);
        jzo jzoVar = new jzo(jzqVar);
        jzqVar.b = scheduledExecutorService.schedule(jzoVar, j, timeUnit);
        jyzVar.c(jzoVar, jxv.a);
        return jzqVar;
    }

    public static Object M(Future future) {
        hwx.X(future.isDone(), "Future was expected to be done: %s", future);
        return amr.f(future);
    }

    public static void N(jyz jyzVar, jyj jyjVar, Executor executor) {
        jyzVar.c(new jyk(jyzVar, jyjVar), executor);
    }

    public static void O(jyz jyzVar, Future future) {
        if (jyzVar instanceof jwq) {
            ((jwq) jyzVar).m(future);
        } else if (jyzVar != null && jyzVar.isCancelled() && future != null) {
            future.cancel(false);
        }
    }

    public static long P(int i) {
        return i & 4294967295L;
    }

    public static lzl Q(Iterable iterable) {
        return new lzl(false, jis.n(iterable));
    }

    @SafeVarargs
    public static lzl R(jyz... jyzVarArr) {
        return new lzl(false, jis.p(jyzVarArr));
    }

    public static lzl S(Iterable iterable) {
        return new lzl(true, jis.n(iterable));
    }

    @SafeVarargs
    public static lzl T(jyz... jyzVarArr) {
        return new lzl(true, jis.p(jyzVarArr));
    }

    public static kao U(kat katVar, ktd ktdVar, ktd ktdVar2, Integer num) {
        knb b;
        if (katVar != null) {
            if (katVar.a == ktdVar.W()) {
                if (katVar.b == ktdVar2.W()) {
                    if (katVar.a() && num == null) {
                        throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                    }
                    if (!katVar.a() && num != null) {
                        throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                    }
                    kas kasVar = katVar.e;
                    if (kasVar == kas.c) {
                        b = kgb.a;
                    } else if (kasVar == kas.b) {
                        b = kgb.a(num.intValue());
                    } else if (kasVar == kas.a) {
                        b = kgb.b(num.intValue());
                    } else {
                        throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(String.valueOf(kasVar))));
                    }
                    return new kao(katVar, ktdVar, ktdVar2, b);
                }
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            throw new GeneralSecurityException("AES key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    private static int[] V(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton) {
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int length2 = drawableState2.length;
        int[] copyOf = Arrays.copyOf(drawableState, length + length2);
        System.arraycopy(drawableState2, 0, copyOf, length, length2);
        return copyOf;
    }

    private static void W(CheckableImageButton checkableImageButton) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        checkableImageButton.setFocusable(hasOnClickListeners);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.c = hasOnClickListeners;
        checkableImageButton.setLongClickable(false);
        int i = 1;
        if (true != hasOnClickListeners) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    public static void a(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof ivf) {
            ((ivf) background).K(f);
        }
    }

    public static void b(View view) {
        Drawable background = view.getBackground();
        if (background instanceof ivf) {
            c(view, (ivf) background);
        }
    }

    public static void c(View view, ivf ivfVar) {
        iqi iqiVar = ivfVar.q.c;
        if (iqiVar != null && iqiVar.a) {
            ivfVar.N(hwx.k(view));
        }
    }

    public static iuu d(int i) {
        if (i != 1) {
            return new ivi();
        }
        return new ivb();
    }

    public static ImageView.ScaleType e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                return ImageView.ScaleType.CENTER;
                            }
                            return ImageView.ScaleType.CENTER_INSIDE;
                        }
                        return ImageView.ScaleType.CENTER_CROP;
                    }
                    return ImageView.ScaleType.FIT_END;
                }
                return ImageView.ScaleType.FIT_CENTER;
            }
            return ImageView.ScaleType.FIT_START;
        }
        return ImageView.ScaleType.FIT_XY;
    }

    public static void f(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = bpu.i(drawable).mutate();
            if (colorStateList != null && colorStateList.isStateful()) {
                bsc.g(drawable, ColorStateList.valueOf(colorStateList.getColorForState(V(textInputLayout, checkableImageButton), colorStateList.getDefaultColor())));
            } else {
                bsc.g(drawable, colorStateList);
            }
            if (mode != null) {
                bsc.h(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void g(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(V(textInputLayout, checkableImageButton), colorStateList.getDefaultColor());
            Drawable mutate = bpu.i(drawable).mutate();
            bsc.g(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void h(CheckableImageButton checkableImageButton) {
        if (Build.VERSION.SDK_INT <= 22) {
            checkableImageButton.setBackground(iuu.c(checkableImageButton.getContext(), (int) hwx.j(checkableImageButton.getContext(), 4)));
        }
    }

    public static void i(CheckableImageButton checkableImageButton, int i) {
        checkableImageButton.setMinimumWidth(i);
        checkableImageButton.setMinimumHeight(i);
    }

    public static void j(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        W(checkableImageButton);
    }

    public static void k(CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener(null);
        W(checkableImageButton);
    }

    public static boolean l(EditText editText) {
        if (editText.getInputType() != 0) {
            return true;
        }
        return false;
    }

    public static String m(String str) {
        if (o(str)) {
            return null;
        }
        return str;
    }

    public static String n(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    public static boolean o(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static jeq p(Class cls) {
        return new jeq(cls.getSimpleName());
    }

    public static jeq q(Object obj) {
        return new jeq(obj.getClass().getSimpleName());
    }

    public static int r(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static String s(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (t(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (t(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean t(char c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        return false;
    }

    public static jyz u(Runnable runnable, long j, long j2, TimeUnit timeUnit, jzd jzdVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + TimeUnit.MILLISECONDS.convert(j, timeUnit);
        long convert = TimeUnit.MILLISECONDS.convert(j2, timeUnit);
        jzm jzmVar = new jzm();
        AtomicReference atomicReference = new AtomicReference(null);
        a.q(atomicReference, jzdVar.schedule(new jdk(jzmVar, runnable, atomicReference, jzdVar, elapsedRealtime, convert), j, timeUnit));
        jzmVar.c(new jxe(atomicReference, 1), jxv.a);
        return jzmVar;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v16, types: [kgc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.Map, java.lang.Object] */
    public static kag v(byte[] bArr) {
        try {
            lja ljaVar = lja.a;
            lkz lkzVar = lkz.a;
            ljn m = ljn.m(kji.d, bArr, 0, bArr.length, lja.a);
            ljn.A(m);
            kji kjiVar = (kji) m;
            kga kgaVar = kga.a;
            kgl kglVar = new kgl(kjiVar, kgt.a(kjiVar.a));
            ktn ktnVar = (ktn) kgaVar.b.get();
            if (!ktnVar.d.containsKey(new kgp(kglVar.getClass(), kglVar.a))) {
                return new kfq(kglVar);
            }
            ktn ktnVar2 = (ktn) kgaVar.b.get();
            kgp kgpVar = new kgp(kglVar.getClass(), kglVar.a);
            if (ktnVar2.d.containsKey(kgpVar)) {
                return ((kgf) ktnVar2.d.get(kgpVar)).a.a(kglVar);
            }
            throw new GeneralSecurityException(der.c(kgpVar, "No Parameters Parser for requested key type ", " available"));
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kgd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map, java.lang.Object] */
    public static byte[] w(kag kagVar) {
        if (kagVar instanceof kfq) {
            return ((kfq) kagVar).a.b.g();
        }
        ktn ktnVar = (ktn) kga.a.b.get();
        kgq kgqVar = new kgq(kagVar.getClass(), kgl.class);
        if (ktnVar.b.containsKey(kgqVar)) {
            return ((kgl) ((kgf) ktnVar.b.get(kgqVar)).a.a(kagVar)).b.g();
        }
        throw new GeneralSecurityException(der.c(kgqVar, "No Key Format serializer for ", " available"));
    }

    public static void x(Throwable th) {
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static jzc y(ExecutorService executorService) {
        jzc jzfVar;
        if (executorService instanceof jzc) {
            return (jzc) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            jzfVar = new jzi((ScheduledExecutorService) executorService);
        } else {
            jzfVar = new jzf(executorService);
        }
        return jzfVar;
    }

    public static jzd z(ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService instanceof jzd) {
            return (jzd) scheduledExecutorService;
        }
        return new jzi(scheduledExecutorService);
    }

    public ivc(byte[] bArr) {
    }
}
