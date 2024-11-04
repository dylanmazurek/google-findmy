package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwp extends chl {
    public cwp(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    protected final String a() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.chl
    protected final /* bridge */ /* synthetic */ void c(cks cksVar, Object obj) {
        elo eloVar = (elo) obj;
        cksVar.g(1, (String) eloVar.b);
        cksVar.g(2, (String) eloVar.a);
    }
}
