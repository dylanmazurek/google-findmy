package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksr {
    static Integer d;
    private static WeakReference e;
    public final Object a;
    public final Object b;
    public Object c;

    public ksr() {
        this.a = new njm(null, null, null);
        this.b = new njm(null, null, null);
        this.c = new bmr[32];
    }

    public static ksr D(Context context, int i, int[] iArr) {
        return new ksr(context, context.obtainStyledAttributes(i, iArr));
    }

    public static ksr E(Context context, AttributeSet attributeSet, int[] iArr) {
        return new ksr(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static ksr F(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new ksr(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.CharSequence, java.lang.Object] */
    private final synchronized void H() {
        nca ncaVar = new nca(this.a, this.b);
        synchronized (ncaVar.c) {
            ((ArrayDeque) ncaVar.c).clear();
            String string = ncaVar.a.getString((String) ncaVar.d, "");
            if (!TextUtils.isEmpty(string) && string.contains(ncaVar.e)) {
                String[] split = string.split((String) ncaVar.e, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        ((ArrayDeque) ncaVar.c).add(str);
                    }
                }
            }
        }
        this.c = ncaVar;
    }

    private final int I(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (!((View) this.a).isLayoutRequested() && i2 == -2) {
            Context context = ((View) this.a).getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                bsc.q(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }
        return 0;
    }

    private static final boolean J(int i) {
        if (i <= 0 && i != Integer.MIN_VALUE) {
            return false;
        }
        return true;
    }

    public static synchronized ksr b(Context context, Executor executor) {
        ksr ksrVar;
        synchronized (ksr.class) {
            WeakReference weakReference = e;
            if (weakReference != null) {
                ksrVar = (ksr) weakReference.get();
            } else {
                ksrVar = null;
            }
            if (ksrVar == null) {
                ksr ksrVar2 = new ksr(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                ksrVar2.H();
                e = new WeakReference(ksrVar2);
                return ksrVar2;
            }
            return ksrVar;
        }
    }

    public static final boolean l(int i, int i2) {
        if (J(i) && J(i2)) {
            return true;
        }
        return false;
    }

    public final boolean A(int i) {
        return ((TypedArray) this.b).hasValue(i);
    }

    public final int B(int i) {
        return ((TypedArray) this.b).getColor(i, 0);
    }

    public final float C(int i) {
        return ((TypedArray) this.b).getDimension(i, -1.0f);
    }

    public final kuv G() {
        return new kuv((kyf) ((ljh) this.b).q(), (ljc) ((ljh) this.a).q());
    }

    public final synchronized ksq a() {
        String str;
        Object obj = this.c;
        synchronized (((nca) obj).c) {
            str = (String) ((ArrayDeque) ((nca) obj).c).peek();
        }
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("!", -1);
            if (split.length == 2) {
                return new ksq(split[0], split[1]);
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final synchronized void c(ksq ksqVar) {
        Object obj = this.c;
        Object obj2 = ((nca) obj).c;
        String str = ksqVar.c;
        synchronized (obj2) {
            if (((ArrayDeque) ((nca) obj).c).remove(str)) {
                ((nca) obj).b.execute(new jxe(obj, 10));
            }
        }
    }

    public final void d() {
        hwx.X(((String) this.c).isEmpty(), "Description can only be updated once; it was already updated by: %s", this.c);
    }

    public final void e(kyl kylVar) {
        d();
        ljh ljhVar = (ljh) this.b;
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        kyf kyfVar = (kyf) ljhVar.b;
        kyf kyfVar2 = kyf.r;
        kylVar.getClass();
        kyfVar.c = kylVar;
        kyfVar.a |= 2;
        ((ljh) this.a).J("description");
        this.c = "description";
    }

    public final File f() {
        Object obj;
        File dataDir;
        synchronized (this.b) {
            if (this.c == null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    dataDir = ((Context) this.a).getDataDir();
                    this.c = dataDir;
                } else {
                    this.c = ((Context) this.a).getDatabasePath("dps-dummy").getParentFile().getParentFile();
                }
            }
            obj = this.c;
        }
        return (File) obj;
    }

    public final void g() {
        synchronized (this.b) {
            this.c = ((fhq) this.a).m().b(jxv.a, new fqx(0));
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jyz] */
    public final jyz h() {
        ?? r1;
        jyz h;
        synchronized (this.b) {
            if (this.c == null) {
                hvq.c((Context) this.a);
                Object obj = this.a;
                int i = lth.a;
                String b = hvo.b((Context) obj, "com.google.android.apps.fmd");
                hvq a = hvq.a((Context) obj);
                hxe hxeVar = (hxe) hxe.a(a.c).get(b);
                if (hxeVar == null) {
                    h = ivc.D(new IllegalStateException(a.ag(b, "Config package", "does not use declarative registration. See go/phenotype-android-integration#phenotype for more information.")));
                } else {
                    hxy hxyVar = a.d;
                    bqm bqmVar = new bqm(a, b, "", hxeVar.c);
                    h = jwu.h(jwu.g(jwb.g(jys.q(hxyVar.c(false)), Throwable.class, new hkn(19), a.b()), new huw(bqmVar, 6), a.b()), new gfl(bqmVar, a, 3), a.b());
                }
                jyz F = ivc.F(h);
                this.c = F;
                ijp.a(F, "Failed fetching flags", new Object[0]);
            }
            r1 = this.c;
        }
        return r1;
    }

    public final int i() {
        int i;
        View view = (View) this.a;
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = ((View) this.a).getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.height;
        } else {
            i = 0;
        }
        return I(((View) this.a).getHeight(), i, paddingTop);
    }

    public final int j() {
        int i;
        View view = (View) this.a;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = ((View) this.a).getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        return I(((View) this.a).getWidth(), i, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    public final void k() {
        ViewTreeObserver viewTreeObserver = ((View) this.a).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.c);
        }
        this.c = null;
        this.b.clear();
    }

    public final void m(cev cevVar) {
        Object obj = this.c;
        if (obj != null) {
            ((cgj) obj).run();
        }
        cgj cgjVar = new cgj((cex) this.b, cevVar);
        this.c = cgjVar;
        ((Handler) this.a).postAtFrontOfQueue(cgjVar);
    }

    public final int n(int i, int i2) {
        return ((TypedArray) this.b).getDimensionPixelOffset(i, i2);
    }

    public final int o(int i, int i2) {
        return ((TypedArray) this.b).getDimensionPixelSize(i, i2);
    }

    public final int p(int i, int i2) {
        return ((TypedArray) this.b).getInt(i, i2);
    }

    public final int q(int i, int i2) {
        return ((TypedArray) this.b).getInteger(i, i2);
    }

    public final int r(int i, int i2) {
        return ((TypedArray) this.b).getLayoutDimension(i, i2);
    }

    public final int s(int i, int i2) {
        return ((TypedArray) this.b).getResourceId(i, i2);
    }

    public final ColorStateList t(int i) {
        int resourceId;
        ColorStateList e2;
        if (((TypedArray) this.b).hasValue(i) && (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) != 0 && (e2 = bqx.e((Context) this.a, resourceId)) != null) {
            return e2;
        }
        return ((TypedArray) this.b).getColorStateList(i);
    }

    public final Drawable u(int i) {
        int resourceId;
        if (((TypedArray) this.b).hasValue(i) && (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) != 0) {
            return cu.c((Context) this.a, resourceId);
        }
        return ((TypedArray) this.b).getDrawable(i);
    }

    public final Drawable v(int i) {
        int resourceId;
        if (((TypedArray) this.b).hasValue(i) && (resourceId = ((TypedArray) this.b).getResourceId(i, 0)) != 0) {
            return ib.d().g((Context) this.a, resourceId);
        }
        return null;
    }

    public final CharSequence w(int i) {
        return ((TypedArray) this.b).getText(i);
    }

    public final String x(int i) {
        return ((TypedArray) this.b).getString(i);
    }

    public final void y() {
        ((TypedArray) this.b).recycle();
    }

    public final boolean z(int i, boolean z) {
        return ((TypedArray) this.b).getBoolean(i, z);
    }

    public ksr(Context context, char[] cArr) {
        this.b = new Object();
        this.a = context;
    }

    private ksr(SharedPreferences sharedPreferences, Executor executor) {
        this.b = executor;
        this.a = sharedPreferences;
    }

    public ksr(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public ksr(cfc cfcVar) {
        this.b = new cex(cfcVar);
        this.a = new Handler();
    }

    public ksr(fhq fhqVar) {
        this.b = new Object();
        this.c = fma.m();
        this.a = fhqVar;
        fhqVar.n(new hui(this, 1));
    }

    public ksr(Context context, byte[] bArr) {
        this.b = new Object();
        this.a = context.getApplicationContext();
    }

    public ksr(View view) {
        this.b = new ArrayList();
        this.a = view;
    }

    public ksr(kxv kxvVar) {
        this.c = "";
        ljh k = kyf.r.k();
        kxvVar.getClass();
        if (!k.b.y()) {
            k.t();
        }
        kyf kyfVar = (kyf) k.b;
        kyfVar.b = kxvVar;
        kyfVar.a |= 1;
        this.b = k;
        this.a = ljc.b.k();
    }

    public ksr(Context context) {
        this.b = new ikg();
        hrb.l(context != null, "Context cannot be null", new Object[0]);
        this.a = context.getApplicationContext();
    }
}
