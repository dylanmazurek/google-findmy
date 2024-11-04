package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ljj extends ljh implements ljl, gbt {
    public ljj() {
        throw null;
    }

    @Override // defpackage.ljh, defpackage.lkp
    /* renamed from: an */
    public final ljk r() {
        if (!((ljk) this.b).y()) {
            return (ljk) this.b;
        }
        ((ljk) this.b).l.e();
        return (ljk) super.r();
    }

    @Override // defpackage.ljl
    public final boolean ao(nqe nqeVar) {
        ljk ljkVar = (ljk) this.b;
        ljkVar.h(nqeVar);
        return ljkVar.l.m((ljm) nqeVar.d);
    }

    public final void ap(nqe nqeVar, Object obj) {
        Map map = ljn.z;
        if (nqeVar.c == this.a) {
            if (!this.b.y()) {
                t();
            }
            ljd ljdVar = ((ljk) this.b).l;
            if (ljdVar.c) {
                ljdVar = ljdVar.clone();
                ((ljk) this.b).l = ljdVar;
            }
            ljm ljmVar = (ljm) nqeVar.d;
            if (ljmVar.a() == lly.ENUM) {
                obj = Integer.valueOf(((ljp) obj).a());
            }
            ljdVar.l(ljmVar, obj);
            return;
        }
        throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    @Override // defpackage.ljh
    public final void t() {
        super.t();
        if (((ljk) this.b).l != ljd.a) {
            ljk ljkVar = (ljk) this.b;
            ljkVar.l = ljkVar.l.clone();
        }
    }

    public ljj(ljk ljkVar) {
        super(ljkVar);
    }
}
