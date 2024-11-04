package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbh {
    public jue a;
    public Integer b;
    public int[] c;
    public int[] d;
    public ffh e;
    private String f;
    private lkq g;
    private int h;

    public final gbi a() {
        lkq lkqVar;
        String str = this.f;
        if (str != null && (lkqVar = this.g) != null && this.h != 0) {
            gbi gbiVar = new gbi(str, lkqVar, this.a, this.b, this.c, this.d, this.e);
            ffh ffhVar = gbiVar.g;
            if (ffhVar != null) {
                loa loaVar = ffhVar.b;
                boolean z = true;
                if (loaVar != loa.EVENT_OVERRIDE && loaVar != loa.EVENT_DEFERRING) {
                    z = false;
                }
                hwx.E(z);
            }
            return gbiVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" logSource");
        }
        if (this.g == null) {
            sb.append(" message");
        }
        if (this.h == 0) {
            sb.append(" qosTier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null logSource");
    }

    public final void c(lkq lkqVar) {
        if (lkqVar != null) {
            this.g = lkqVar;
            return;
        }
        throw new NullPointerException("Null message");
    }

    public final void d() {
        this.h = 1;
    }
}
