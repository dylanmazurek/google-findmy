package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cci implements mmz {
    private final cci a;
    private final hpd b;

    public cci(cci cciVar, hpd hpdVar) {
        this.a = cciVar;
        this.b = hpdVar;
    }

    public final void a(hpd hpdVar) {
        if (this.b != hpdVar) {
            cci cciVar = this.a;
            if (cciVar != null) {
                cciVar.a(hpdVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
    }

    @Override // defpackage.mnb
    public final Object fold(Object obj, mol molVar) {
        return mjo.x(this, obj, molVar);
    }

    @Override // defpackage.mmz, defpackage.mnb
    public final mmz get(mna mnaVar) {
        return mjo.y(this, mnaVar);
    }

    @Override // defpackage.mmz
    public final mna getKey() {
        return bcr.c;
    }

    @Override // defpackage.mnb
    public final mnb minusKey(mna mnaVar) {
        return mjo.z(this, mnaVar);
    }

    @Override // defpackage.mnb
    public final mnb plus(mnb mnbVar) {
        return mjo.A(this, mnbVar);
    }
}
