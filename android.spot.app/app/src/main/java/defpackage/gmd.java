package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmd implements glt {
    private static final joo a = joo.m("GnpSdk");
    private final glu b;
    private final jer c;
    private final ghf d;

    public gmd(glu gluVar, jer jerVar, ghf ghfVar) {
        this.b = gluVar;
        this.c = jerVar;
        this.d = ghfVar;
    }

    @Override // defpackage.glt
    public final void a(ghp ghpVar) {
        gxh gxhVar;
        if (this.c.g()) {
            if (!ghpVar.d.isEmpty()) {
                Bundle i = bqj.i(ghpVar.f);
                if (i == null) {
                    ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/internal/systemtray/impl/ReplyActionEventHandler", "handle", 56, "ReplyActionEventHandler.java")).r("Reply action text could not be retrieved from intent.");
                    return;
                }
                CharSequence charSequence = i.getCharSequence("com.google.android.libraries.notifications.REPLY_TEXT_KEY");
                if (charSequence != null) {
                    ghg b = this.d.b(lde.ACTION_CLICK);
                    ghn ghnVar = (ghn) b;
                    ghnVar.G = 2;
                    ghnVar.F = 2;
                    b.e(ghpVar.c);
                    b.c((ggk) ghpVar.d.get(0));
                    b.a();
                    gxs gxsVar = (gxs) this.c.c();
                    charSequence.toString();
                    gxsVar.i();
                    glu gluVar = this.b;
                    ggk ggkVar = (ggk) ghpVar.d.get(0);
                    goa goaVar = ghpVar.c;
                    gip gipVar = new gip();
                    gipVar.f(giu.c(goaVar));
                    gipVar.c();
                    gipVar.d(true);
                    gipVar.b();
                    gipVar.e(gnd.c());
                    gxh gxhVar2 = ghpVar.g;
                    String charSequence2 = charSequence.toString();
                    if (gxhVar2.a.size() == 0) {
                        ljh k = gxh.b.k();
                        k.z(charSequence2);
                        gxhVar = (gxh) k.q();
                    } else {
                        ljv ljvVar = gxhVar2.a;
                        ljh ljhVar = (ljh) gxhVar2.z(5);
                        ljhVar.w(gxhVar2);
                        if (!ljhVar.b.y()) {
                            ljhVar.t();
                        }
                        ((gxh) ljhVar.b).a = lla.a;
                        ljhVar.z(charSequence2);
                        if (!ljhVar.b.y()) {
                            ljhVar.t();
                        }
                        gxh gxhVar3 = (gxh) ljhVar.b;
                        gxhVar3.b();
                        lhv.g(ljvVar, gxhVar3.a);
                        gxhVar = (gxh) ljhVar.q();
                    }
                    gipVar.d = gxhVar;
                    gipVar.a = (byte) (gipVar.a | 8);
                    gluVar.c(ggkVar, gipVar.a());
                    return;
                }
                return;
            }
            ((jol) ((jol) a.f()).j("com/google/android/libraries/notifications/internal/systemtray/impl/ReplyActionEventHandler", "handle", 51, "ReplyActionEventHandler.java")).r("No threads associated with this event.");
            return;
        }
        ((jol) a.k().j("com/google/android/libraries/notifications/internal/systemtray/impl/ReplyActionEventHandler", "handle", 47, "ReplyActionEventHandler.java")).r("No collaborator handler provided.");
    }
}
