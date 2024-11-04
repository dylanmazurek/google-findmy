package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dt implements gs {
    final /* synthetic */ du a;
    private boolean b;

    public dt(du duVar) {
        this.a = duVar;
    }

    @Override // defpackage.gs
    public final void a(gh ghVar, boolean z) {
        if (this.b) {
            return;
        }
        this.b = true;
        this.a.c.c();
        this.a.a.onPanelClosed(108, ghVar);
        this.b = false;
    }

    @Override // defpackage.gs
    public final boolean b(gh ghVar) {
        this.a.a.onMenuOpened(108, ghVar);
        return true;
    }
}
