package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cux extends chl {
    public cux(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    protected final String a() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // defpackage.chl
    protected final /* bridge */ /* synthetic */ void c(cks cksVar, Object obj) {
        elo eloVar = (elo) obj;
        cksVar.g(1, (String) eloVar.b);
        cksVar.g(2, (String) eloVar.a);
    }
}
