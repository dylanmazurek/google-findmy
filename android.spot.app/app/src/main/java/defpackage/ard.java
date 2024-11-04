package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ard extends arf {
    public final aql a;

    public ard(aql aqlVar) {
        this.a = aqlVar;
    }

    @Override // defpackage.arf
    public final aql a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ard) && amr.i(this.a, ((ard) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
