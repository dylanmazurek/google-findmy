package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ljk extends ljn implements ljl {
    public ljd l = ljd.a;

    @Override // defpackage.ljl
    public final boolean ao(nqe nqeVar) {
        throw null;
    }

    public final ljd c() {
        ljd ljdVar = this.l;
        if (ljdVar.c) {
            this.l = ljdVar.clone();
        }
        return this.l;
    }

    public final void h(nqe nqeVar) {
        if (nqeVar.c == ((ljn) z(6))) {
        } else {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
