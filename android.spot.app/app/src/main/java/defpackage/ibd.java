package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibd extends fzd {
    final /* synthetic */ ibf b;

    public ibd(ibf ibfVar) {
        this.b = ibfVar;
    }

    @Override // defpackage.fzd
    public final void a(int i) {
        jni jniVar = (jni) ((jni) ibf.a.f().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl$1", "onScanFailed", 482, "BleScannerImpl.java");
        bym bymVar = this.b.k;
        boolean z = false;
        if (bymVar != null && bymVar.q()) {
            z = true;
        }
        jniVar.H(i, z);
        this.b.e(i);
    }

    @Override // defpackage.fzd
    public final void b(fze fzeVar) {
        synchronized (this.b.f) {
            this.b.d(new ah(fzeVar, 18));
        }
    }
}
