package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzz implements ffl {
    private final fzl a;
    private final fzp b;

    protected fzz(Context context, fzp fzpVar) {
        Context context2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        gaa gaaVar = new gaa();
        fzk fzkVar = new fzk(null);
        fzkVar.a();
        if (applicationContext != null) {
            fzkVar.a = applicationContext;
            fzkVar.c = jer.i(gaaVar);
            fzkVar.a();
            if (fzkVar.e == 1 && (context2 = fzkVar.a) != null) {
                this.a = new fzl(context2, fzkVar.b, fzkVar.c, fzkVar.d);
                this.b = fzpVar;
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (fzkVar.a == null) {
                sb.append(" context");
            }
            if (fzkVar.e == 0) {
                sb.append(" googlerOverridesCheckbox");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null context");
    }

    public static ffl b(Context context, fzj fzjVar) {
        return new fzz(context, new fzp(fzjVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0157 A[Catch: all -> 0x0175, TryCatch #6 {, blocks: (B:8:0x0020, B:10:0x0024, B:12:0x0033, B:14:0x003f, B:16:0x004c, B:17:0x015f, B:19:0x0163, B:20:0x016a, B:22:0x0053, B:24:0x005d, B:25:0x0061, B:28:0x006e, B:30:0x0073, B:41:0x00e0, B:42:0x0153, B:44:0x0157, B:56:0x00e6, B:57:0x00e9, B:60:0x00fa, B:61:0x0106, B:63:0x010e, B:64:0x0113, B:66:0x0117, B:69:0x011d, B:71:0x0134, B:73:0x0138, B:75:0x0140, B:77:0x0148, B:79:0x014f, B:81:0x015a, B:84:0x016c, B:85:0x016f, B:88:0x00f7, B:89:0x0170, B:90:0x0173, B:32:0x007d, B:34:0x0082, B:35:0x0085, B:37:0x0096, B:38:0x009c, B:40:0x00a0, B:45:0x00a9, B:47:0x00b2, B:48:0x00b7, B:51:0x00c4, B:54:0x00d1, B:27:0x0065, B:87:0x00f0), top: B:7:0x0020, inners: #0, #5, #8 }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r7v2 */
    @Override // defpackage.ffl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.lim r18) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fzz.a(lim):void");
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
