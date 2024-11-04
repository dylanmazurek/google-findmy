package defpackage;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjp {
    public final Object a;
    public int b;
    public Object c;

    public mjp(ImageView imageView) {
        this.b = 0;
        this.a = imageView;
    }

    public final void a(byte b) {
        int i = this.b + 1;
        byte[] bArr = (byte[]) this.c;
        int length = bArr.length;
        if (length < i) {
            int i2 = length + (length >> 1);
            if (i2 >= i) {
                i = i2;
            }
            this.c = Arrays.copyOf(bArr, i);
        }
        Object obj = this.c;
        int i3 = this.b;
        this.b = i3 + 1;
        ((byte[]) obj)[i3] = b;
    }

    public final void b(StringBuilder sb) {
        int i = this.b;
        if (i != 0) {
            sb.append(new String((byte[]) this.c, 0, i, (Charset) this.a));
            this.b = 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void c(int i, int i2, Intent intent) {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((fjj) it.next()).c(i, i2, intent);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final void d(Bundle bundle) {
        Bundle bundle2;
        this.b = 1;
        this.c = bundle;
        for (Map.Entry entry : this.a.entrySet()) {
            fjj fjjVar = (fjj) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            fjjVar.d(bundle2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final void e() {
        this.b = 5;
        for (fjj fjjVar : this.a.values()) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final void f() {
        this.b = 3;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((fjj) it.next()).h();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void g(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : this.a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((fjj) entry.getValue()).g(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final void h() {
        this.b = 2;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((fjj) it.next()).i();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Map, java.lang.Object] */
    public final void i() {
        this.b = 4;
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((fjj) it.next()).j();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    public final void j(fjj fjjVar) {
        if (!this.a.containsKey("ConnectionlessLifecycleHelper")) {
            this.a.put("ConnectionlessLifecycleHelper", fjjVar);
            if (this.b > 0) {
                new fqw(Looper.getMainLooper()).post(new ci(this, fjjVar, 13));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("LifecycleCallback with tag ConnectionlessLifecycleHelper already added to this fragment.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void k() {
        for (fjj fjjVar : this.a.values()) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final fjj l(Class cls) {
        return (fjj) cls.cast(this.a.get("ConnectionlessLifecycleHelper"));
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Iterable] */
    public final cpl m() {
        Set set;
        if (Build.VERSION.SDK_INT >= 24) {
            set = mkm.aj(this.a);
        } else {
            set = mlz.a;
        }
        Set set2 = set;
        return new cpl((cxa) this.c, this.b, false, false, false, false, -1L, -1L, set2);
    }

    public final void n(int i) {
        this.b = 2;
        this.c = new cxa((byte[]) null);
    }

    public final void o() {
        if (((ImageView) this.a).getDrawable() != null) {
            ((ImageView) this.a).getDrawable().setLevel(this.b);
        }
    }

    public final void p() {
        Drawable drawable = ((ImageView) this.a).getDrawable();
        if (drawable != null) {
            jv.a(drawable);
        }
        if (drawable != null && Build.VERSION.SDK_INT <= 21) {
            if (this.c == null) {
                this.c = new na();
            }
            na naVar = (na) this.c;
            naVar.a();
            ColorStateList a = bzp.a((ImageView) this.a);
            if (a != null) {
                naVar.d = true;
                naVar.a = a;
            }
            PorterDuff.Mode b = bzp.b((ImageView) this.a);
            if (b != null) {
                naVar.c = true;
                naVar.b = b;
            }
            if (naVar.d || naVar.c) {
                mn.g(drawable, naVar, ((ImageView) this.a).getDrawableState());
            }
        }
    }

    public final void q(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int s;
        ksr F = ksr.F(((ImageView) this.a).getContext(), attributeSet, eb.f, i, 0);
        Object obj = F.b;
        Object obj2 = this.a;
        bwn.p((View) obj2, ((ImageView) obj2).getContext(), eb.f, attributeSet, (TypedArray) obj, i, 0);
        try {
            Drawable drawable3 = ((ImageView) this.a).getDrawable();
            if (drawable3 == null && (s = F.s(1, -1)) != -1 && (drawable3 = cu.c(((ImageView) this.a).getContext(), s)) != null) {
                ((ImageView) this.a).setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                jv.a(drawable3);
            }
            if (F.A(2)) {
                Object obj3 = this.a;
                bzp.c((ImageView) obj3, F.t(2));
                if (Build.VERSION.SDK_INT == 21 && (drawable2 = ((ImageView) obj3).getDrawable()) != null && bzp.a((ImageView) obj3) != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(((ImageView) obj3).getDrawableState());
                    }
                    ((ImageView) obj3).setImageDrawable(drawable2);
                }
            }
            if (F.A(3)) {
                Object obj4 = this.a;
                bzp.d((ImageView) obj4, a.h(F.p(3, -1), null));
                if (Build.VERSION.SDK_INT == 21 && (drawable = ((ImageView) obj4).getDrawable()) != null && bzp.a((ImageView) obj4) != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(((ImageView) obj4).getDrawableState());
                    }
                    ((ImageView) obj4).setImageDrawable(drawable);
                }
            }
        } finally {
            F.y();
        }
    }

    public final void r(Drawable drawable) {
        this.b = drawable.getLevel();
    }

    public final void s(int i) {
        if (i != 0) {
            Drawable c = cu.c(((ImageView) this.a).getContext(), i);
            if (c != null) {
                jv.a(c);
            }
            ((ImageView) this.a).setImageDrawable(c);
        } else {
            ((ImageView) this.a).setImageDrawable(null);
        }
        p();
    }

    public final boolean t() {
        if (((ImageView) this.a).getBackground() instanceof RippleDrawable) {
            return false;
        }
        return true;
    }

    public mjp(bdi bdiVar) {
        this.a = bdiVar;
    }

    public mjp(Object obj) {
        this.a = obj;
    }

    public mjp(byte[] bArr) {
        this.c = new cxa((byte[]) null);
        this.b = 1;
        this.a = new LinkedHashSet();
    }

    public mjp() {
        this.a = DesugarCollections.synchronizedMap(new rx());
        this.b = 0;
    }

    public mjp(int i, Charset charset) {
        this.c = new byte[Math.min(16, i)];
        this.a = charset;
    }
}
