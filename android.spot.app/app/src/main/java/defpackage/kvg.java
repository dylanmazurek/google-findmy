package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kvg implements kvm {
    private final /* synthetic */ int a;
    private final Object b;

    public kvg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kvm
    public final /* synthetic */ kvy a() {
        if (this.a != 0) {
            return kvy.a;
        }
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final /* synthetic */ kvy b() {
        if (this.a != 0) {
            return kvy.a;
        }
        return kvy.a;
    }

    @Override // defpackage.kvm
    public final /* synthetic */ kvy f(nqe nqeVar) {
        if (this.a != 0) {
            return kvy.a;
        }
        return kvy.a;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ktp, java.lang.Object] */
    @Override // defpackage.kvm
    public final kvy g(nqe nqeVar) {
        boolean z;
        if (this.a != 0) {
            lys lysVar = (lys) nqeVar.d;
            if (lysVar.e(ktm.a) == null) {
                z = true;
            } else {
                z = false;
            }
            hwx.V(z, "ChannelConfig provided twice");
            return new kvy(1, null, null, lysVar.d(ktm.a, this.b));
        }
        hwx.V(true, "Cronet does not support CallOptions.withAuthority(). See https://github.com/grpc/grpc-java/issues/1767");
        Object obj = nqeVar.d;
        lys lysVar2 = (lys) obj;
        kto ktoVar = (kto) lysVar2.e(kto.a);
        if (ktoVar == null) {
            ktoVar = this.b.c(((mbg) nqeVar.b).b);
            ktoVar.getClass();
            obj = lysVar2.d(kto.a, ktoVar);
        }
        return new kvy(1, null, null, ((lys) obj).d(gan.a, ktoVar.a()));
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.kvm
    public final /* synthetic */ void e(ktf ktfVar) {
    }
}
