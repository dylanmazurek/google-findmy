package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvb extends chl {
    public cvb(cih cihVar) {
        super(cihVar);
    }

    @Override // defpackage.cio
    protected final String a() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.chl
    protected final /* bridge */ /* synthetic */ void c(cks cksVar, Object obj) {
        cuz cuzVar = (cuz) obj;
        cksVar.g(1, cuzVar.a);
        cksVar.e(2, cuzVar.b.longValue());
    }
}
