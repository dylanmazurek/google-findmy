package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.adm.R;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhd {
    public final boolean a;
    public final jiy b;
    private final jiy c;

    public hhd() {
        throw null;
    }

    public static hhd b(Context context) {
        return c(context, jdl.a);
    }

    public static hhd c(Context context, jer jerVar) {
        int i;
        boolean d = d(context);
        jiy e = e(context, jerVar);
        jiu jiuVar = new jiu();
        for (hhb hhbVar : hhb.values()) {
            if (d) {
                i = hhbVar.e;
            } else {
                i = hhbVar.f;
            }
            jiuVar.d(hhbVar, Integer.valueOf(bqx.c(context, i)));
        }
        return new hhd(d, e, jiuVar.b());
    }

    public static boolean d(Context context) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0) {
            return true;
        }
        return false;
    }

    private static jiy e(Context context, jer jerVar) {
        hhc[] values = hhc.values();
        int length = values.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = values[i].g;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        EnumMap enumMap = new EnumMap(hhc.class);
        for (int i2 = 0; i2 < values.length; i2++) {
            try {
                try {
                    hhc hhcVar = values[i2];
                    enumMap.put((EnumMap) hhcVar, (hhc) Integer.valueOf(obtainStyledAttributes.getColor(i2, context.getResources().getColor(hhcVar.h))));
                } catch (UnsupportedOperationException e) {
                    if (!jerVar.g()) {
                        throw e;
                    }
                    Object c = jerVar.c();
                    final String packageName = context.getPackageName();
                    final boolean M = hog.M(context);
                    final boolean ac = frx.ac(context);
                    final boolean d = d(context);
                    final int min = Math.min(i2, 3);
                    final boolean f = f(i2 + 1, obtainStyledAttributes, context);
                    final hri hriVar = (hri) c;
                    ((hri) c).m(new Runnable() { // from class: hje
                        /* JADX WARN: Type inference failed for: r0v1, types: [jfe, java.lang.Object] */
                        /* JADX WARN: Type inference failed for: r0v4, types: [jfe, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((imq) ((hpd) hri.this.a.a()).f.a()).b(packageName, Boolean.valueOf(M), Boolean.valueOf(ac), Boolean.valueOf(d), Integer.valueOf(min), Boolean.valueOf(f));
                        }
                    });
                    throw e;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        obtainStyledAttributes.recycle();
        Iterator it = enumMap.entrySet().iterator();
        if (!it.hasNext()) {
            return jmn.a;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Enum r0 = (Enum) entry.getKey();
        Object value = entry.getValue();
        hwx.B(r0, value);
        EnumMap enumMap2 = new EnumMap(Collections.singletonMap(r0, value));
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            Enum r02 = (Enum) entry2.getKey();
            Object value2 = entry2.getValue();
            hwx.B(r02, value2);
            enumMap2.put((EnumMap) r02, (Enum) value2);
        }
        int size = enumMap2.size();
        if (size != 0) {
            if (size != 1) {
                return new jik(enumMap2);
            }
            Map.Entry entry3 = (Map.Entry) hzc.Y(enumMap2.entrySet());
            return jiy.j((Enum) entry3.getKey(), entry3.getValue());
        }
        return jmn.a;
    }

    private static boolean f(int i, TypedArray typedArray, Context context) {
        hhc[] values = hhc.values();
        if (i == values.length) {
            return false;
        }
        try {
            typedArray.getColor(i, context.getResources().getColor(values[i].h));
            return false;
        } catch (UnsupportedOperationException unused) {
            return true;
        }
    }

    public final int a(hhb hhbVar) {
        Integer num = (Integer) this.c.get(hhbVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unsupported GoogleColors value");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hhd) {
            hhd hhdVar = (hhd) obj;
            if (this.a == hhdVar.a && this.b.equals(hhdVar.b) && hzc.F(this.c, hhdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (true != this.a) {
            i = 1237;
        } else {
            i = 1231;
        }
        return ((((i ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "OneGoogleColorResolver{isLightTheme=" + this.a + ", colorsMap=" + this.b.toString() + ", googleThemedColorsMap=" + hzc.D(this.c) + "}";
    }

    public hhd(boolean z, jiy jiyVar, jiy jiyVar2) {
        this.a = z;
        this.b = jiyVar;
        this.c = jiyVar2;
    }
}
