package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glk implements jei {
    public glk() {
    }

    public static void c(goa goaVar, ggf ggfVar) {
        goaVar.getClass();
        String str = goaVar.b;
        if (str != null) {
            ggfVar.b = str;
            return;
        }
        throw new NullPointerException("Null accountName");
    }

    public static void d(goa goaVar, ggf ggfVar) {
        int i;
        goaVar.getClass();
        int i2 = goaVar.f;
        switch (i2) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                throw new IllegalArgumentException(a.am(i2, "Registration status ", " is not supported"));
        }
        ggfVar.l = i;
    }

    @Override // defpackage.jei
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ggi a(goa goaVar) {
        String str;
        Long l;
        Long l2;
        int i;
        Long l3;
        Long l4;
        String str2;
        String str3;
        ggf ggfVar = new ggf();
        ggfVar.d = 0L;
        ggfVar.e = 0L;
        ggfVar.l = 1;
        ggfVar.f = 0L;
        ggfVar.a(0);
        ggfVar.h = 0L;
        ggfVar.i = "";
        ggfVar.j = "";
        ggfVar.a = Long.valueOf(goaVar.a);
        c(goaVar, ggfVar);
        String str4 = goaVar.c;
        if (str4 != null) {
            ggfVar.c = str4;
        }
        ggfVar.d = Long.valueOf(goaVar.j);
        d(goaVar, ggfVar);
        ggfVar.f = Long.valueOf(goaVar.k);
        ggfVar.a(goaVar.l);
        ggfVar.h = Long.valueOf(goaVar.m);
        String str5 = goaVar.n;
        if (str5 != null) {
            ggfVar.i = str5;
        }
        String str6 = goaVar.i;
        if (str6 != null) {
            ggfVar.j = str6;
        }
        if (ggfVar.k == 1 && (str = ggfVar.b) != null && (l = ggfVar.d) != null && (l2 = ggfVar.e) != null && (i = ggfVar.l) != 0 && (l3 = ggfVar.f) != null && (l4 = ggfVar.h) != null && (str2 = ggfVar.i) != null && (str3 = ggfVar.j) != null) {
            return new ggi(ggfVar.a, str, ggfVar.c, l, l2, i, l3, ggfVar.g, l4, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if (ggfVar.b == null) {
            sb.append(" accountName");
        }
        if (ggfVar.d == null) {
            sb.append(" syncVersion");
        }
        if (ggfVar.e == null) {
            sb.append(" pageVersion");
        }
        if (ggfVar.l == 0) {
            sb.append(" registrationStatus");
        }
        if (ggfVar.f == null) {
            sb.append(" lastRegistrationTimeMs");
        }
        if (ggfVar.k == 0) {
            sb.append(" lastRegistrationRequestHash");
        }
        if (ggfVar.h == null) {
            sb.append(" firstRegistrationVersion");
        }
        if (ggfVar.i == null) {
            sb.append(" internalTargetId");
        }
        if (ggfVar.j == null) {
            sb.append(" representativeTargetId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public glk(byte[] bArr) {
        this();
    }
}
