package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvg extends chl {
    public cvg(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    protected final String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.chl
    protected final /* bridge */ /* synthetic */ void c(cks cksVar, Object obj) {
        cksVar.g(1, ((cve) obj).a);
        cksVar.e(2, r5.b);
        cksVar.e(3, r5.c);
    }
}
