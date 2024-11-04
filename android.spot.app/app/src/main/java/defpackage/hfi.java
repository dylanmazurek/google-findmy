package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class hfi implements jei {
    @Override // defpackage.jei
    public final /* synthetic */ Object a(Object obj) {
        String str;
        int i;
        int i2;
        hjw hjwVar = (hjw) obj;
        hfk hfkVar = new hfk();
        hfkVar.b(true);
        hfkVar.a(false);
        hfkVar.j = 1;
        hfkVar.k = 1;
        hfkVar.b(hjwVar.b);
        String str2 = hjwVar.c;
        if (str2 != null) {
            hfkVar.b = str2;
        }
        String str3 = hjwVar.a;
        if (str3 != null) {
            hfkVar.c = str3;
            String str4 = hjwVar.d;
            if (str4 != null) {
                hfkVar.d = str4;
            }
            String str5 = hjwVar.e;
            if (str5 != null) {
                hfkVar.e = str5;
            }
            hfkVar.a(hjwVar.g);
            b(hjwVar, hfkVar);
            String str6 = hjwVar.f;
            if (str6 != null) {
                hfkVar.g = str6;
            }
            String str7 = hjwVar.h;
            if (str7 != null) {
                hfkVar.h = str7;
            }
            c(hjwVar, hfkVar);
            if (hfkVar.i == 3 && (str = hfkVar.c) != null && (i = hfkVar.j) != 0 && (i2 = hfkVar.k) != 0) {
                return new hfl(hfkVar.a, hfkVar.b, str, hfkVar.d, hfkVar.e, hfkVar.f, i, hfkVar.g, hfkVar.h, i2);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & hfkVar.i) == 0) {
                sb.append(" isMetadataAvailable");
            }
            if (hfkVar.c == null) {
                sb.append(" accountName");
            }
            if ((hfkVar.i & 2) == 0) {
                sb.append(" isG1User");
            }
            if (hfkVar.j == 0) {
                sb.append(" isDasherUser");
            }
            if (hfkVar.k == 0) {
                sb.append(" isUnicornUser");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null accountName");
    }

    public abstract void b(hjw hjwVar, hfk hfkVar);

    public abstract void c(hjw hjwVar, hfk hfkVar);
}
