package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biz implements Comparable {
    public static final biz a;
    public static final biz b;
    public static final biz c;
    public static final biz d;
    public static final biz e;
    public static final biz f;
    private static final biz h;
    private static final biz i;
    private static final biz j;
    private static final biz k;
    private static final biz l;
    private static final biz m;
    public final int g;

    static {
        biz bizVar = new biz(100);
        h = bizVar;
        biz bizVar2 = new biz(200);
        i = bizVar2;
        biz bizVar3 = new biz(300);
        j = bizVar3;
        biz bizVar4 = new biz(400);
        a = bizVar4;
        biz bizVar5 = new biz(500);
        b = bizVar5;
        biz bizVar6 = new biz(600);
        c = bizVar6;
        biz bizVar7 = new biz(700);
        k = bizVar7;
        biz bizVar8 = new biz(800);
        l = bizVar8;
        biz bizVar9 = new biz(900);
        m = bizVar9;
        d = bizVar4;
        e = bizVar5;
        f = bizVar7;
        mkm.P(bizVar, bizVar2, bizVar3, bizVar4, bizVar5, bizVar6, bizVar7, bizVar8, bizVar9);
    }

    public biz(int i2) {
        this.g = i2;
        if (i2 > 0 && i2 < 1001) {
            return;
        }
        throw new IllegalArgumentException("Font weight can be in range [1, 1000]. Current value: " + i2);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(biz bizVar) {
        return mpd.a(this.g, bizVar.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof biz) && this.g == ((biz) obj).g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.g;
    }

    public final String toString() {
        return "FontWeight(weight=" + this.g + ')';
    }
}
