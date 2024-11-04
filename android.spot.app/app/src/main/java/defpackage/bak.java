package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bak extends bai {
    public static bak b;
    public bgk c;

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
        int i2;
        if (a().length() > 0 && i < a().length()) {
            if (i < 0) {
                bgk bgkVar = this.c;
                if (bgkVar == null) {
                    mpd.b("layoutResult");
                    bgkVar = null;
                }
                i2 = bgkVar.c(0);
            } else {
                bgk bgkVar2 = this.c;
                if (bgkVar2 == null) {
                    mpd.b("layoutResult");
                    bgkVar2 = null;
                }
                int c = bgkVar2.c(i);
                if (e(c, 2) == i) {
                    i2 = c;
                } else {
                    i2 = c + 1;
                }
            }
            bgk bgkVar3 = this.c;
            if (bgkVar3 == null) {
                mpd.b("layoutResult");
                bgkVar3 = null;
            }
            if (i2 < bgkVar3.b()) {
                return b(e(i2, 2), e(i2, 1) + 1);
            }
        }
        return null;
    }

    @Override // defpackage.ban
    public final int[] d(int i) {
        int i2;
        if (a().length() > 0 && i > 0) {
            if (i > a().length()) {
                bgk bgkVar = this.c;
                if (bgkVar == null) {
                    mpd.b("layoutResult");
                    bgkVar = null;
                }
                i2 = bgkVar.c(a().length());
            } else {
                bgk bgkVar2 = this.c;
                if (bgkVar2 == null) {
                    mpd.b("layoutResult");
                    bgkVar2 = null;
                }
                int c = bgkVar2.c(i);
                if (e(c, 1) + 1 == i) {
                    i2 = c;
                } else {
                    i2 = c - 1;
                }
            }
            if (i2 >= 0) {
                return b(e(i2, 2), e(i2, 1) + 1);
            }
        }
        return null;
    }
}
