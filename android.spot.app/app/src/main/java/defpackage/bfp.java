package defpackage;

import android.graphics.Canvas;
import android.text.TextUtils;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfp {
    public final bkd a;
    public final bhl b;
    public final CharSequence c;
    public final List d;
    private final int e;
    private final boolean f;
    private final long g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0243  */
    /* JADX WARN: Type inference failed for: r0v43, types: [android.text.Spannable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bfp(defpackage.bkd r25, int r26, boolean r27, long r28) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfp.<init>(bkd, int, boolean, long):void");
    }

    private final bhl k(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        float e = e();
        bke g = g();
        bkb bkbVar = bkc.a;
        CharSequence charSequence = this.c;
        bkd bkdVar = this.a;
        return new bhl(charSequence, e, g, i, truncateAt, bkdVar.e, i3, i5, i6, i7, i4, i2, bkdVar.d);
    }

    public final float a() {
        return d(0);
    }

    public final float b() {
        return this.b.e();
    }

    public final float c() {
        return d(f() - 1);
    }

    public final float d(int i) {
        float lineBaseline;
        bhl bhlVar = this.b;
        if (i == bhlVar.c - 1 && bhlVar.e != null) {
            lineBaseline = bhlVar.b(i) - bhlVar.e.ascent;
        } else {
            lineBaseline = bhlVar.b.getLineBaseline(i);
        }
        return bhlVar.d + lineBaseline;
    }

    public final float e() {
        return bld.b(this.g);
    }

    public final int f() {
        return this.b.c;
    }

    public final bke g() {
        return this.a.b;
    }

    public final boolean h() {
        return this.b.a;
    }

    public final void i(int i) {
        this.b.c(i, false);
    }

    public final void j(aqv aqvVar, long j, arl arlVar, bkv bkvVar, kv kvVar) {
        int i = g().a;
        bke g = g();
        g.c(j);
        g.d(arlVar);
        g.e(bkvVar);
        g.f(kvVar);
        g.b(3);
        Canvas a = aqp.a(aqvVar);
        if (h()) {
            a.save();
            a.clipRect(0.0f, 0.0f, e(), b());
        }
        bhl bhlVar = this.b;
        if (a.getClipBounds(bhlVar.f)) {
            int i2 = bhlVar.d;
            if (i2 != 0) {
                a.translate(0.0f, i2);
            }
            bhk bhkVar = bhm.a;
            bhkVar.a = a;
            bhlVar.b.draw(bhkVar);
            int i3 = bhlVar.d;
            if (i3 != 0) {
                a.translate(0.0f, -i3);
            }
        }
        if (h()) {
            a.restore();
        }
        g().b(i);
    }
}
