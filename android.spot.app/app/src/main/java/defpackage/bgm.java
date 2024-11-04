package defpackage;

import com.google.ar.core.ImageMetadata;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgm {
    public static final bgm a;
    public final bgh b;
    public final bgb c;
    public final bgg d;

    static {
        long j = aqx.e;
        long j2 = blp.a;
        a = new bgm(new bgh(j, j2, null, null, null, null, j2, null, aqx.e), new bgb(Integer.MIN_VALUE, Integer.MIN_VALUE, j2, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    public bgm(bgh bghVar, bgb bgbVar, bgg bggVar) {
        this.b = bghVar;
        this.c = bgbVar;
        this.d = bggVar;
    }

    public static /* synthetic */ bgm u(bgm bgmVar, long j, biz bizVar, bip bipVar, long j2, long j3, bgg bggVar, bkt bktVar, int i) {
        long j4;
        long j5;
        biz bizVar2;
        biv bivVar;
        biw biwVar;
        bip bipVar2;
        String str;
        long j6;
        bkn bknVar;
        bkz bkzVar;
        bjy bjyVar;
        bkv bkvVar;
        arl arlVar;
        kv kvVar;
        int i2;
        long j7;
        bla blaVar;
        bgg bggVar2;
        bkt bktVar2;
        bky d;
        bge bgeVar;
        long j8 = 0;
        if ((i & 1) != 0) {
            j4 = bgmVar.b.b();
        } else {
            j4 = 0;
        }
        if ((i & 2) != 0) {
            j5 = bgmVar.b.b;
        } else {
            j5 = j;
        }
        if ((i & 4) != 0) {
            bizVar2 = bgmVar.b.c;
        } else {
            bizVar2 = bizVar;
        }
        if ((i & 8) != 0) {
            bivVar = bgmVar.b.d;
        } else {
            bivVar = null;
        }
        if ((i & 16) != 0) {
            biwVar = bgmVar.b.e;
        } else {
            biwVar = null;
        }
        if ((i & 32) != 0) {
            bipVar2 = bgmVar.b.f;
        } else {
            bipVar2 = bipVar;
        }
        if ((i & 64) != 0) {
            str = bgmVar.b.g;
        } else {
            str = null;
        }
        if ((i & 128) != 0) {
            j6 = bgmVar.b.h;
        } else {
            j6 = j2;
        }
        if ((i & 256) != 0) {
            bknVar = bgmVar.b.i;
        } else {
            bknVar = null;
        }
        if ((i & 512) != 0) {
            bkzVar = bgmVar.b.j;
        } else {
            bkzVar = null;
        }
        if ((i & 1024) != 0) {
            bjyVar = bgmVar.b.k;
        } else {
            bjyVar = null;
        }
        if ((i & 2048) != 0) {
            j8 = bgmVar.b.l;
        }
        long j9 = j8;
        if ((i & 4096) != 0) {
            bkvVar = bgmVar.b.m;
        } else {
            bkvVar = null;
        }
        if ((i & 8192) != 0) {
            arlVar = bgmVar.b.n;
        } else {
            arlVar = null;
        }
        if ((i & 16384) != 0) {
            kvVar = bgmVar.b.p;
        } else {
            kvVar = null;
        }
        int i3 = 0;
        if ((32768 & i) != 0) {
            i2 = bgmVar.c.a;
        } else {
            i2 = 0;
        }
        if ((65536 & i) != 0) {
            i3 = bgmVar.c.b;
        }
        if ((131072 & i) != 0) {
            j7 = bgmVar.c.c;
        } else {
            j7 = j3;
        }
        if ((262144 & i) != 0) {
            blaVar = bgmVar.c.d;
        } else {
            blaVar = null;
        }
        if ((524288 & i) != 0) {
            bggVar2 = bgmVar.d;
        } else {
            bggVar2 = bggVar;
        }
        if ((i & ImageMetadata.SHADING_MODE) != 0) {
            bktVar2 = bgmVar.c.f;
        } else {
            bktVar2 = bktVar;
        }
        bgb bgbVar = bgmVar.c;
        int i4 = bgbVar.g;
        int i5 = bgbVar.h;
        blb blbVar = bgbVar.i;
        if (a.n(j4, bgmVar.b.b())) {
            d = bgmVar.b.a;
        } else {
            d = arj.d(j4);
        }
        bgh bghVar = new bgh(d, j5, bizVar2, bivVar, biwVar, bipVar2, str, j6, bknVar, bkzVar, bjyVar, j9, bkvVar, arlVar, kvVar);
        if (bggVar2 != null) {
            bgeVar = bggVar2.b;
        } else {
            bgeVar = null;
        }
        return new bgm(bghVar, new bgb(i2, i3, j7, blaVar, bgeVar, bktVar2, i4, i5, blbVar), bggVar2);
    }

    public static /* synthetic */ bgm v(bgm bgmVar, long j, long j2, long j3, int i, long j4, int i2) {
        long j5;
        long j6;
        long j7;
        long j8;
        int i3;
        long j9;
        if ((i2 & 1) != 0) {
            j5 = aqx.e;
        } else {
            j5 = j;
        }
        if ((i2 & 2) != 0) {
            j6 = blp.a;
        } else {
            j6 = j2;
        }
        if ((i2 & 128) != 0) {
            j7 = blp.a;
        } else {
            j7 = j3;
        }
        if ((i2 & 2048) != 0) {
            j8 = aqx.e;
        } else {
            j8 = 0;
        }
        long j10 = j8;
        int i4 = Integer.MIN_VALUE;
        if ((32768 & i2) != 0) {
            i3 = Integer.MIN_VALUE;
        } else {
            i3 = i;
        }
        if ((65536 & i2) == 0) {
            i4 = 0;
        }
        if ((i2 & 131072) != 0) {
            j9 = blp.a;
        } else {
            j9 = j4;
        }
        bgh a2 = bgi.a(bgmVar.b, j5, j6, null, null, null, null, null, j7, null, null, null, j10, null, null, null);
        bgb a3 = bgc.a(bgmVar.c, i3, i4, j9, null, null, null, 0, Integer.MIN_VALUE, null);
        if (bgmVar.b == a2 && bgmVar.c == a3) {
            return bgmVar;
        }
        return new bgm(a2, a3);
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.c.g;
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return this.c.b;
    }

    public final long e() {
        return this.b.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgm)) {
            return false;
        }
        bgm bgmVar = (bgm) obj;
        if (amr.i(this.b, bgmVar.b) && amr.i(this.c, bgmVar.c) && amr.i(this.d, bgmVar.d)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.b.b;
    }

    public final long g() {
        return this.b.h;
    }

    public final long h() {
        return this.c.c;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        if (this.d != null) {
            i = 38347;
        } else {
            i = 0;
        }
        return (hashCode * 31) + i;
    }

    public final arl i() {
        return this.b.n;
    }

    public final bip j() {
        return this.b.f;
    }

    public final biv k() {
        return this.b.d;
    }

    public final biw l() {
        return this.b.e;
    }

    public final biz m() {
        return this.b.c;
    }

    public final bjy n() {
        return this.b.k;
    }

    public final bkt o() {
        return this.c.f;
    }

    public final bkv p() {
        return this.b.m;
    }

    public final bla q() {
        return this.c.d;
    }

    public final blb r() {
        return this.c.i;
    }

    public final boolean s(bgm bgmVar) {
        if (this != bgmVar && !this.b.e(bgmVar.b)) {
            return false;
        }
        return true;
    }

    public final boolean t(bgm bgmVar) {
        if (this == bgmVar) {
            return true;
        }
        if (amr.i(this.c, bgmVar.c) && this.b.d(bgmVar.b)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) aqx.g(e()));
        sb.append(", brush=null, alpha=");
        w();
        sb.append(a());
        sb.append(", fontSize=");
        sb.append((Object) blp.d(f()));
        sb.append(", fontWeight=");
        sb.append(m());
        sb.append(", fontStyle=");
        sb.append(k());
        sb.append(", fontSynthesis=");
        sb.append(l());
        sb.append(", fontFamily=");
        sb.append(j());
        sb.append(", fontFeatureSettings=");
        sb.append(this.b.g);
        sb.append(", letterSpacing=");
        sb.append((Object) blp.d(g()));
        sb.append(", baselineShift=");
        sb.append(this.b.i);
        sb.append(", textGeometricTransform=");
        sb.append(this.b.j);
        sb.append(", localeList=");
        sb.append(n());
        sb.append(", background=");
        sb.append((Object) aqx.g(this.b.l));
        sb.append(", textDecoration=");
        sb.append(p());
        sb.append(", shadow=");
        sb.append(i());
        sb.append(", drawStyle=");
        sb.append(x());
        sb.append(", textAlign=");
        sb.append((Object) bku.a(c()));
        sb.append(", textDirection=");
        sb.append((Object) bkw.a(d()));
        sb.append(", lineHeight=");
        sb.append((Object) blp.d(h()));
        sb.append(", textIndent=");
        sb.append(q());
        sb.append(", platformStyle=");
        sb.append(this.d);
        sb.append(", lineHeightStyle=");
        sb.append(o());
        sb.append(", lineBreak=");
        sb.append((Object) bkr.a(b()));
        sb.append(", hyphens=");
        sb.append((Object) bkq.a(this.c.h));
        sb.append(", textMotion=");
        sb.append(r());
        sb.append(')');
        return sb.toString();
    }

    public final void w() {
        this.b.f();
    }

    public final kv x() {
        return this.b.p;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bgm(defpackage.bgh r3, defpackage.bgb r4) {
        /*
            r2 = this;
            bge r0 = r4.e
            if (r0 != 0) goto L6
            r0 = 0
            goto Lc
        L6:
            bgg r1 = new bgg
            r1.<init>(r0)
            r0 = r1
        Lc:
            r2.<init>(r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgm.<init>(bgh, bgb):void");
    }
}
