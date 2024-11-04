package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class esx extends cgk {
    public final cfm a;
    public kyh b = kyh.DEVICE_COMPONENT_UNSPECIFIED;
    public jer c = jdl.a;

    public esx(cfk cfkVar, final ilv ilvVar) {
        ilvVar.getClass();
        ewh ewhVar = new ewh(new ebd(ilvVar, 7), new ebd(ilvVar, 8), new Supplier() { // from class: esv
            @Override // java.util.function.Supplier
            public final Object get() {
                return ilv.this.f();
            }
        });
        cfm cfmVar = new cfm();
        this.a = cfmVar;
        cfmVar.o(cfkVar, new epy(this, 12));
        cfmVar.o(ewhVar, new epy(this, 13));
    }

    public final void a() {
        if (this.c.g()) {
            this.a.l(new esw(((eiv) this.c.c()).a(this.b)));
        }
    }
}
