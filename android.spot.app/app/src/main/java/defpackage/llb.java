package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llb implements lkn {
    public final lkq a;
    public final String b;
    public final Object[] c;
    private final int d;

    public llb(lkq lkqVar, String str, Object[] objArr) {
        this.a = lkqVar;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.d = i | (charAt2 << i3);
                return;
            }
        }
    }

    @Override // defpackage.lkn
    public final lkq a() {
        return this.a;
    }

    @Override // defpackage.lkn
    public final boolean b() {
        if ((this.d & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lkn
    public final int c() {
        int i = this.d;
        if ((i & 1) != 0) {
            return 1;
        }
        if ((i & 4) == 4) {
            return 3;
        }
        return 2;
    }
}
