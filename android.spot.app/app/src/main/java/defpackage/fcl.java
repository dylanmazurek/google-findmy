package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fcl extends fck {
    private boolean a;

    /* JADX INFO: Access modifiers changed from: protected */
    public fcl(fcn fcnVar) {
        super(fcnVar);
    }

    public final void H() {
        if (J()) {
        } else {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void I() {
        a();
        this.a = true;
    }

    public final boolean J() {
        if (this.a) {
            return true;
        }
        return false;
    }

    protected abstract void a();
}
