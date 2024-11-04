package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.maps.android.ui.RotationLayout;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lbr {
    public final Object a;
    public final Object b;
    public final Object c;
    public Object d;
    public final Object e;

    public lbr() {
    }

    private final void k() {
        boolean z;
        ckg e = e();
        if (e != null) {
            if (((chj) this.b).m == 3) {
                z = true;
            } else {
                z = false;
            }
            e.b(z);
        }
    }

    private final float l(int i, boolean z) {
        Layout layout = (Layout) this.b;
        int ad = moz.ad(i, layout.getLineEnd(layout.getLineForOffset(i)));
        if (z) {
            return ((Layout) this.b).getPrimaryHorizontal(ad);
        }
        return ((Layout) this.b).getSecondaryHorizontal(ad);
    }

    public final void a(Drawable drawable) {
        ((ViewGroup) this.b).setBackgroundDrawable(drawable);
        Rect rect = new Rect();
        drawable.getPadding(rect);
        ((ViewGroup) this.b).setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void b(Context context, int i) {
        Object obj = this.d;
        if (obj != null) {
            ((TextView) obj).setTextAppearance(context, i);
        }
    }

    public final void c() {
        b((Context) this.a, R.style.amu_ClusterIcon_TextAppearance);
    }

    protected final cii d() {
        return (cii) this.c;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ckg] */
    public final ckg e() {
        Object obj = this.a;
        if (true != (obj instanceof chz)) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        return ((chz) obj).b.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x0104, code lost:            if (r3.getRunCount() == 1) goto L54;     */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float f(int r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbr.f(int, boolean, boolean):float");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final int g(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) this.c.get(i - 1)).intValue();
    }

    public final int h(int i, int i2) {
        while (i > i2) {
            int i3 = i - 1;
            char charAt = ((Layout) this.b).getText().charAt(i3);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760) {
                if (mpd.a(charAt, 8192) >= 0 && mpd.a(charAt, 8202) <= 0) {
                    if (charAt == 8199) {
                        charAt = 8199;
                    } else {
                        continue;
                    }
                }
                if (charAt != 8287 && charAt != 12288) {
                    break;
                }
            }
            i = i3;
        }
        return i;
    }

    public final boolean i(int i) {
        if (((Layout) this.b).getParagraphDirection(((Layout) this.b).getLineForOffset(g(i))) == -1) {
            return true;
        }
        return false;
    }

    public final void j(ddh ddhVar) {
        bzb.b(ddhVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bzb.b(ddhVar, bwg.k(d().b));
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.List, java.lang.Object] */
    public lbr(Layout layout) {
        this.b = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int x = moz.x(((Layout) this.b).getText(), '\n', i, 4);
            i = x < 0 ? ((Layout) this.b).getText().length() : x + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.b).getText().length());
        this.c = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.a = arrayList2;
        this.e = new boolean[this.c.size()];
        this.c.size();
    }

    public lbr(chj chjVar, cii ciiVar) {
        this();
        this.b = chjVar;
        this.c = ciiVar;
        this.e = chjVar.d;
        this.a = new chz(new ddh(chjVar.c.a(bzl.e(chjVar.a, chjVar.b, new cia(this, ciiVar.a), false, false)), (byte[]) null));
        k();
    }

    public lbr(chj chjVar, moh mohVar) {
        this();
        this.b = chjVar;
        this.c = new chy();
        this.e = chjVar.d;
        this.a = new chz(new ddh(mohVar.a(new chj(chjVar.a, chjVar.b, chjVar.c, chjVar.n, mkm.ad(chjVar.d, new cif(new bco(this, 10))), chjVar.e, chjVar.m, chjVar.f, chjVar.g, chjVar.h, chjVar.i, chjVar.j, chjVar.k, chjVar.l)), (byte[]) null));
        k();
    }

    public lbr(Drawable.Callback callback) {
        this.b = new dbq();
        this.c = new HashMap();
        this.e = new HashMap();
        this.d = ".ttf";
        if (!(callback instanceof View)) {
            deu.a("LottieDrawable must be inside of a view for images to work.");
            this.a = null;
        } else {
            this.a = ((View) callback).getContext().getAssets();
        }
    }

    public lbr(Context context) {
        this.a = context;
        lbq lbqVar = new lbq(context);
        this.e = lbqVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        this.b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        this.c = rotationLayout;
        this.d = (TextView) rotationLayout.findViewById(R.id.amu_text);
        lbqVar.a = -1;
        a(lbqVar);
        b(context, R.style.amu_Bubble_TextAppearance_Dark);
    }
}
