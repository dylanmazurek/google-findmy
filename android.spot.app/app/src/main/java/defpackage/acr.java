package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acr extends aep {
    private final agk b;

    public acr(agk agkVar, mnw mnwVar) {
        super(mnwVar);
        this.b = agkVar;
    }

    @Override // defpackage.aep
    public final aeq b(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        return new aeq(this, obj, z, this.b, true);
    }
}
