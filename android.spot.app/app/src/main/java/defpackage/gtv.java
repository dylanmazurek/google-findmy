package defpackage;

import android.content.Context;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gtv extends mnp implements mol {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtv(cyb cybVar, Context context, String str, String str2, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.b = cybVar;
        this.d = context;
        this.c = str;
        this.a = str2;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.e != 0) {
            return ((gtv) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((gtv) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076 A[Catch: Exception -> 0x007d, TryCatch #1 {Exception -> 0x007d, blocks: (B:11:0x004c, B:17:0x006f, B:20:0x007a, B:23:0x0076), top: B:10:0x004c }] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [gst, java.lang.Object] */
    @Override // defpackage.mnj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.e
            if (r0 == 0) goto L86
            defpackage.mjo.o(r7)
            java.lang.Object r7 = r6.b
            cyb r7 = (defpackage.cyb) r7
            java.util.Map r7 = r7.c
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L15:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r7.next()
            dbk r0 = (defpackage.dbk) r0
            java.lang.Object r1 = r6.d
            r0.getClass()
            java.lang.Object r2 = r6.c
            java.lang.Object r3 = r6.a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = (java.lang.String) r2
            r4.append(r2)
            java.lang.String r2 = r0.a
            r4.append(r2)
            java.lang.String r3 = (java.lang.String) r3
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Exception -> L80
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Exception -> L80
            android.graphics.Typeface r1 = android.graphics.Typeface.createFromAsset(r1, r2)     // Catch: java.lang.Exception -> L80
            r1.getClass()     // Catch: java.lang.Exception -> L7d
            java.lang.String r2 = r0.c     // Catch: java.lang.Exception -> L7d
            r2.getClass()     // Catch: java.lang.Exception -> L7d
            java.lang.String r3 = "Italic"
            boolean r3 = defpackage.moz.t(r2, r3)     // Catch: java.lang.Exception -> L7d
            java.lang.String r4 = "Bold"
            boolean r2 = defpackage.moz.t(r2, r4)     // Catch: java.lang.Exception -> L7d
            r4 = 0
            if (r3 == 0) goto L68
            if (r2 == 0) goto L67
            r4 = 3
            goto L6f
        L67:
            r2 = 0
        L68:
            if (r3 == 0) goto L6c
            r4 = 2
            goto L6f
        L6c:
            if (r2 == 0) goto L6f
            r4 = 1
        L6f:
            int r2 = r1.getStyle()     // Catch: java.lang.Exception -> L7d
            if (r2 != r4) goto L76
            goto L7a
        L76:
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r1, r4)     // Catch: java.lang.Exception -> L7d
        L7a:
            r0.d = r1     // Catch: java.lang.Exception -> L7d
            goto L15
        L7d:
            int r0 = defpackage.deu.a
            goto L15
        L80:
            int r0 = defpackage.deu.a
            goto L15
        L83:
            mlh r7 = defpackage.mlh.a
            return r7
        L86:
            defpackage.mjo.o(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Object r1 = r6.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L9d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            goa r3 = (defpackage.goa) r3
            java.lang.Object r4 = r6.b
            int r4 = r4.a(r3)
            int r5 = r3.f
            if (r5 == r4) goto Lc8
            gnz r5 = new gnz
            r5.<init>(r3)
            r5.h(r4)
            goa r3 = r5.a()
            r7.add(r3)
        Lc8:
            java.lang.Object r2 = r2.getKey()
            r0.put(r2, r3)
            goto L9d
        Ld0:
            java.lang.Object r1 = r6.c
            java.lang.Object r2 = r6.d
            hri r1 = (defpackage.hri) r1
            java.lang.Object r1 = r1.a
            hri r1 = (defpackage.hri) r1
            gny r2 = (defpackage.gny) r2
            goj r1 = r1.A(r2)
            r1.f(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtv.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v0, types: [gst, java.lang.Object] */
    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.e != 0) {
            Object obj2 = this.b;
            Object obj3 = this.d;
            return new gtv((cyb) obj2, (Context) obj3, (String) this.c, (String) this.a, mmxVar, 1);
        }
        return new gtv((Map) this.a, (gst) this.b, (hri) this.c, (gny) this.d, mmxVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gtv(Map map, gst gstVar, hri hriVar, gny gnyVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.e = i;
        this.a = map;
        this.b = gstVar;
        this.c = hriVar;
        this.d = gnyVar;
    }
}
