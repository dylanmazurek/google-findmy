package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqu extends cjj {
    public static final cqu c = new cqu();

    private cqu() {
        super(12, 13);
    }

    @Override // defpackage.cjj
    public final void a(ckd ckdVar) {
        ckdVar.g("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        ckdVar.g("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
