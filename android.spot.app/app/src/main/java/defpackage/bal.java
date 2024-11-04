package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bal extends bai {
    public static bal b;
    public bgk c;
    public bfh d;

    public bal() {
        new Rect();
    }

    private final int e(int i, int i2) {
        bgk bgkVar = this.c;
        bgk bgkVar2 = null;
        if (bgkVar == null) {
            mpd.b("layoutResult");
            bgkVar = null;
        }
        int e = bgkVar.e(i);
        bgk bgkVar3 = this.c;
        if (bgkVar3 == null) {
            mpd.b("layoutResult");
            bgkVar3 = null;
        }
        if (i2 != bgkVar3.f(e)) {
            bgk bgkVar4 = this.c;
            if (bgkVar4 == null) {
                mpd.b("layoutResult");
            } else {
                bgkVar2 = bgkVar4;
            }
            return bgkVar2.e(i);
        }
        bgk bgkVar5 = this.c;
        if (bgkVar5 == null) {
            mpd.b("layoutResult");
        } else {
            bgkVar2 = bgkVar5;
        }
        return bgk.g(bgkVar2, i) - 1;
    }

    @Override // defpackage.ban
    public final int[] c(int i) {
        int b2;
        bgk bgkVar = null;
        if (a().length() > 0 && i < a().length()) {
            try {
                bfh bfhVar = this.d;
                if (bfhVar == null) {
                    mpd.b("node");
                    bfhVar = null;
                }
                int round = Math.round(bfhVar.b().a());
                int ac = moz.ac(0, i);
                bgk bgkVar2 = this.c;
                if (bgkVar2 == null) {
                    mpd.b("layoutResult");
                    bgkVar2 = null;
                }
                int c = bgkVar2.c(ac);
                bgk bgkVar3 = this.c;
                if (bgkVar3 == null) {
                    mpd.b("layoutResult");
                    bgkVar3 = null;
                }
                float a = bgkVar3.a(c) + round;
                bgk bgkVar4 = this.c;
                if (bgkVar4 == null) {
                    mpd.b("layoutResult");
                    bgkVar4 = null;
                }
                bgk bgkVar5 = this.c;
                if (bgkVar5 == null) {
                    mpd.b("layoutResult");
                    bgkVar5 = null;
                }
                if (a < bgkVar4.a(bgkVar5.b() - 1)) {
                    bgk bgkVar6 = this.c;
                    if (bgkVar6 == null) {
                        mpd.b("layoutResult");
                    } else {
                        bgkVar = bgkVar6;
                    }
                    b2 = bgkVar.d(a);
                } else {
                    bgk bgkVar7 = this.c;
                    if (bgkVar7 == null) {
                        mpd.b("layoutResult");
                    } else {
                        bgkVar = bgkVar7;
                    }
                    b2 = bgkVar.b();
                }
                return b(ac, e(b2 - 1, 1) + 1);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.ban
    public final int[] d(int i) {
        int i2;
        bgk bgkVar = null;
        if (a().length() > 0 && i > 0) {
            try {
                bfh bfhVar = this.d;
                if (bfhVar == null) {
                    mpd.b("node");
                    bfhVar = null;
                }
                int round = Math.round(bfhVar.b().a());
                int ad = moz.ad(a().length(), i);
                bgk bgkVar2 = this.c;
                if (bgkVar2 == null) {
                    mpd.b("layoutResult");
                    bgkVar2 = null;
                }
                int c = bgkVar2.c(ad);
                bgk bgkVar3 = this.c;
                if (bgkVar3 == null) {
                    mpd.b("layoutResult");
                    bgkVar3 = null;
                }
                float a = bgkVar3.a(c) - round;
                if (a > 0.0f) {
                    bgk bgkVar4 = this.c;
                    if (bgkVar4 == null) {
                        mpd.b("layoutResult");
                    } else {
                        bgkVar = bgkVar4;
                    }
                    i2 = bgkVar.d(a);
                } else {
                    i2 = 0;
                }
                if (ad == a().length() && i2 < c) {
                    i2++;
                }
                return b(e(i2, 2), ad);
            } catch (IllegalStateException unused) {
            }
        }
        return null;
    }
}
