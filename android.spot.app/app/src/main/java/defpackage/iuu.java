package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.adm.R;
import com.google.android.material.tabs.TabLayout;
import j$.util.DesugarCollections;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iuu {
    public static long A(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return (((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16)) & 4294967295L;
    }

    public static void B(byte[] bArr, long j, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i + i2] = (byte) (255 & j);
            j >>= 8;
        }
    }

    public static boolean C() {
        if (kcq.a() != null) {
            return true;
        }
        return false;
    }

    public static jck D(Iterable iterable) {
        return new jck(ivc.Q(iterable), (byte[]) null);
    }

    @SafeVarargs
    public static jck E(jyz... jyzVarArr) {
        return new jck(ivc.R(jyzVarArr), (byte[]) null);
    }

    @SafeVarargs
    public static jck F(jyz... jyzVarArr) {
        return new jck(new jck(ivc.T(jyzVarArr), (byte[]) null), (byte[]) null);
    }

    public static kuv G(Map map, Map map2) {
        return new kuv(DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2), (byte[]) null);
    }

    public static kde H(kdh kdhVar, ktd ktdVar, Integer num) {
        knb b;
        if (kdhVar != null) {
            if (kdhVar.a == ktdVar.W()) {
                if (kdhVar.a() && num == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!kdhVar.a() && num != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                kdg kdgVar = kdhVar.b;
                if (kdgVar == kdg.c) {
                    b = kgb.a;
                } else if (kdgVar == kdg.b) {
                    b = kgb.a(num.intValue());
                } else if (kdgVar == kdg.a) {
                    b = kgb.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown AesSivParameters.Variant: ".concat(String.valueOf(String.valueOf(kdgVar))));
                }
                return new kde(kdhVar, ktdVar, b);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new IllegalArgumentException("Cannot build without parameters and/or key material");
    }

    public static Drawable c(Context context, int i) {
        ColorStateList colorStateList;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setShape(1);
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) gradientDrawable, i, i, i, i);
        ColorStateList valueOf = ColorStateList.valueOf(0);
        TypedValue o = hzc.o(context, R.attr.colorControlHighlight);
        if (o != null) {
            if (o.resourceId != 0) {
                colorStateList = bqx.e(context, o.resourceId);
            } else {
                colorStateList = ColorStateList.valueOf(o.data);
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            valueOf = colorStateList;
        }
        return new RippleDrawable(valueOf, null, insetDrawable);
    }

    public static RectF f(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (!tabLayout.w && (view instanceof ixb)) {
            ixb ixbVar = (ixb) view;
            View[] viewArr = {ixbVar.a, ixbVar.b, null};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view2 = viewArr[i3];
                if (view2 != null && view2.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view2.getLeft());
                    } else {
                        i2 = view2.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view2.getRight());
                    } else {
                        i = view2.getRight();
                    }
                    z = true;
                }
            }
            int i4 = i - i2;
            View[] viewArr2 = {ixbVar.a, ixbVar.b, null};
            int i5 = 0;
            int i6 = 0;
            boolean z2 = false;
            for (int i7 = 0; i7 < 3; i7++) {
                View view3 = viewArr2[i7];
                if (view3 != null && view3.getVisibility() == 0) {
                    if (z2) {
                        i6 = Math.min(i6, view3.getTop());
                    } else {
                        i6 = view3.getTop();
                    }
                    if (z2) {
                        i5 = Math.max(i5, view3.getBottom());
                    } else {
                        i5 = view3.getBottom();
                    }
                    z2 = true;
                }
            }
            int i8 = i5 - i6;
            int j = (int) hwx.j(ixbVar.getContext(), 24);
            if (i4 < j) {
                i4 = j;
            }
            int left = (ixbVar.getLeft() + ixbVar.getRight()) / 2;
            int top = (ixbVar.getTop() + ixbVar.getBottom()) / 2;
            int i9 = i4 / 2;
            return new RectF(left - i9, top - (i8 / 2), left + i9, (left / 2) + top);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static Uri i() {
        return new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path("").build();
    }

    public static jyz j(jyz jyzVar, Class cls, jxd jxdVar, Executor executor) {
        return jwb.h(jyzVar, cls, jbn.c(jxdVar), executor);
    }

    public static jyz k(jxc jxcVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return ivc.G(jbn.b(jxcVar), j, timeUnit, scheduledExecutorService);
    }

    public static jyz l(Runnable runnable, Executor executor) {
        return ivc.H(jbn.f(runnable), executor);
    }

    public static jyz m(Callable callable, Executor executor) {
        return ivc.I(jbn.g(callable), executor);
    }

    public static jyz n(jxc jxcVar, Executor executor) {
        return ivc.J(jbn.b(jxcVar), executor);
    }

    public static jyz o(jyz jyzVar, jei jeiVar, Executor executor) {
        return jwu.g(jyzVar, jbn.a(jeiVar), executor);
    }

    public static jyz p(jyz jyzVar, jxd jxdVar, Executor executor) {
        return jwu.h(jyzVar, jbn.c(jxdVar), executor);
    }

    public static void q(jyz jyzVar, jyj jyjVar, Executor executor) {
        ivc.N(jyzVar, jbn.e(jyjVar), executor);
    }

    public static jbx r(Throwable th) {
        return jbx.d(ivc.D(th));
    }

    public static jbx s(Runnable runnable, Executor executor) {
        return jbx.d(l(runnable, executor));
    }

    public static jbx t(jxc jxcVar, Executor executor) {
        return jbx.d(n(jxcVar, executor));
    }

    public static void u(Enum r0, Object obj, Map map, Map map2) {
        map.put(r0, obj);
        map2.put(obj, r0);
    }

    public static byte[] v(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] w(BigInteger bigInteger, int i) {
        if (bigInteger.signum() != -1) {
            byte[] byteArray = bigInteger.toByteArray();
            int length = byteArray.length;
            if (length == i) {
                return byteArray;
            }
            int i2 = i + 1;
            if (length <= i2) {
                if (length == i2) {
                    if (byteArray[0] == 0) {
                        return Arrays.copyOfRange(byteArray, 1, length);
                    }
                    throw new GeneralSecurityException("integer too large");
                }
                byte[] bArr = new byte[i];
                System.arraycopy(byteArray, 0, bArr, i - length, length);
                return bArr;
            }
            throw new GeneralSecurityException("integer too large");
        }
        throw new IllegalArgumentException("integer must be nonnegative");
    }

    public static void x(ktn ktnVar) {
        Integer num;
        kab kabVar;
        ArrayList arrayList = new ArrayList();
        kfr kfrVar = kfr.a;
        Iterator it = ktnVar.b().iterator();
        while (it.hasNext()) {
            for (kgi kgiVar : (List) it.next()) {
                int i = kgiVar.f - 2;
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            kabVar = kab.c;
                        } else {
                            throw new IllegalStateException("Unknown key status");
                        }
                    } else {
                        kabVar = kab.b;
                    }
                } else {
                    kabVar = kab.a;
                }
                int i2 = kgiVar.d;
                String str = kgiVar.e;
                if (str.startsWith("type.googleapis.com/google.crypto.")) {
                    str = str.substring(34);
                }
                arrayList.add(new kfs(kabVar, i2, str, kgiVar.c.name()));
            }
        }
        Object obj = ktnVar.b;
        if (obj != null) {
            num = Integer.valueOf(((kgi) obj).d);
        } else {
            num = null;
        }
        if (num != null) {
            try {
                int intValue = num.intValue();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = ((kfs) arrayList.get(i3)).a;
                    i3++;
                    if (i4 == intValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    public static boolean y(int i) {
        Boolean bool;
        if (i - 1 != 0) {
            if (kdd.a()) {
                try {
                    bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
                } catch (Exception unused) {
                    kdd.a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                    bool = false;
                }
                if (!bool.booleanValue()) {
                    return false;
                }
            }
            return true;
        }
        if (!kdd.a()) {
            return true;
        }
        return false;
    }

    public static long z(byte[] bArr, int i, int i2) {
        return (A(bArr, i) >> i2) & 67108863;
    }

    public void a(Object obj) {
        throw null;
    }

    public void e(ivv ivvVar, float f, float f2, float f3) {
        d(ivvVar, f, f3);
    }

    public void g(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF f2 = f(tabLayout, view);
        RectF f3 = f(tabLayout, view2);
        drawable.setBounds(inc.b((int) f2.left, (int) f3.left, f), drawable.getBounds().top, inc.b((int) f2.right, (int) f3.right, f), drawable.getBounds().bottom);
    }

    public void h(Object obj) {
    }

    public void d(ivv ivvVar, float f, float f2) {
    }
}
