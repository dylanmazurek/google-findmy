package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjg implements bjf {
    private final /* synthetic */ int a;

    public bjg(int i) {
        this.a = i;
    }

    private static final Typeface c(String str, biz bizVar) {
        if (a.m(0, 0) && amr.i(bizVar, biz.d) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int d = bhe.d(bizVar);
        if (str != null && str.length() != 0) {
            return Typeface.create(str, d);
        }
        return Typeface.defaultFromStyle(d);
    }

    private static final Typeface d(String str, biz bizVar) {
        Typeface create;
        Typeface create2;
        if (a.m(0, 0) && amr.i(bizVar, biz.d) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        create2 = Typeface.create(create, bizVar.g, a.m(0, 1));
        return create2;
    }

    @Override // defpackage.bjf
    public final Typeface a(biz bizVar) {
        if (this.a != 0) {
            return d(null, bizVar);
        }
        return c(null, bizVar);
    }

    @Override // defpackage.bjf
    public final Typeface b(bja bjaVar, biz bizVar) {
        String str;
        if (this.a != 0) {
            return d(bjaVar.c, bizVar);
        }
        int i = bizVar.g / 100;
        String str2 = bjaVar.c;
        if (i >= 0 && i < 2) {
            str2 = str2.concat("-thin");
        } else {
            if (i >= 2 && i < 4) {
                str = "-light";
            } else if (i != 4) {
                if (i == 5) {
                    str = "-medium";
                } else if ((i < 6 || i >= 8) && i >= 8 && i < 11) {
                    str = "-black";
                }
            }
            str2 = str2.concat(str);
        }
        Typeface typeface = null;
        if (str2.length() != 0) {
            Typeface c = c(str2, bizVar);
            if (!amr.i(c, Typeface.create(Typeface.DEFAULT, bhe.d(bizVar))) && !amr.i(c, c(null, bizVar))) {
                typeface = c;
            }
        }
        if (typeface == null) {
            return c(bjaVar.c, bizVar);
        }
        return typeface;
    }
}
