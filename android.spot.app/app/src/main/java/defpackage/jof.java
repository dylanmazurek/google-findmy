package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jof {
    public static final jof c = new job();
    public static final jof d = new job();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jof b(jof jofVar, jof jofVar2) {
        jof jofVar3;
        if (jofVar == null) {
            return jofVar2;
        }
        if (jofVar2 == null) {
            return jofVar;
        }
        jof jofVar4 = c;
        if (jofVar != jofVar4 && jofVar2 != (jofVar3 = d)) {
            if (jofVar2 != jofVar4 && jofVar != jofVar3) {
                return new joc(jofVar, jofVar2);
            }
            return jofVar2;
        }
        return jofVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a();
}
