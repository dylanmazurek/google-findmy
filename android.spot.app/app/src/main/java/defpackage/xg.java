package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xg extends mnp implements mol {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ moh e;
    final /* synthetic */ Enum f;
    final /* synthetic */ Object g;
    private /* synthetic */ Object h;
    private final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(vr vrVar, bfi bfiVar, moh mohVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.i = i;
        this.f = vrVar;
        this.g = bfiVar;
        this.e = mohVar;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.i != 0) {
            return ((xg) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
        return ((xg) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, muf] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, muf] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        atk atkVar;
        atk atkVar2;
        atk atkVar3;
        Object obj2;
        Object obj3;
        moh mohVar;
        atk atkVar4;
        Object obj4;
        Throwable th;
        Object obj5;
        bfi bfiVar;
        bfi bfiVar2;
        bfi bfiVar3;
        Object obj6;
        Object obj7;
        moh mohVar2;
        bfi bfiVar4;
        Object obj8;
        Throwable th2;
        Object obj9;
        if (this.i != 0) {
            mne mneVar = mne.a;
            int i = this.d;
            try {
                try {
                    if (i != 0) {
                        if (i != 1) {
                            obj8 = (bfi) this.b;
                            obj9 = this.a;
                            bfiVar4 = (bfi) this.h;
                            try {
                                mjo.o(obj);
                                a.p((AtomicReference) ((bfi) obj8).b, bfiVar4);
                                ((ncd) obj9).d();
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                a.p((AtomicReference) ((bfi) obj8).b, bfiVar4);
                                throw th2;
                            }
                        }
                        Object obj10 = this.c;
                        mohVar2 = (moh) this.b;
                        obj7 = this.a;
                        bfiVar = (bfi) this.h;
                        mjo.o(obj);
                        obj6 = obj10;
                    } else {
                        mjo.o(obj);
                        msw mswVar = (msw) this.h;
                        Enum r5 = this.f;
                        mmz mmzVar = mswVar.b().get(muf.c);
                        mmzVar.getClass();
                        bfiVar = new bfi(r5, (muf) mmzVar, null);
                        Object obj11 = this.g;
                        do {
                            bfiVar2 = (bfi) obj11;
                            bfiVar3 = (bfi) ((AtomicReference) bfiVar2.b).get();
                            if (bfiVar3 != null) {
                                if (((vr) bfiVar.b).compareTo((vr) bfiVar3.b) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                            }
                        } while (!a.o((AtomicReference) bfiVar2.b, bfiVar3, bfiVar));
                        if (bfiVar3 != null) {
                            bfiVar3.a.s(new vs());
                        }
                        obj6 = this.g;
                        moh mohVar3 = this.e;
                        this.h = bfiVar;
                        obj7 = ((bfi) obj6).a;
                        this.a = obj7;
                        this.b = mohVar3;
                        this.c = obj6;
                        this.d = 1;
                        if (((ncd) obj7).b(this) != mneVar) {
                            mohVar2 = mohVar3;
                        } else {
                            return mneVar;
                        }
                    }
                    this.h = bfiVar4;
                    this.a = obj7;
                    this.b = obj6;
                    this.c = null;
                    this.d = 2;
                    Object a = mohVar2.a(this);
                    if (a != mneVar) {
                        obj8 = obj6;
                        obj = a;
                        obj9 = obj7;
                        a.p((AtomicReference) ((bfi) obj8).b, bfiVar4);
                        ((ncd) obj9).d();
                        return obj;
                    }
                    return mneVar;
                } catch (Throwable th4) {
                    obj8 = obj6;
                    th2 = th4;
                    a.p((AtomicReference) ((bfi) obj8).b, bfiVar4);
                    throw th2;
                }
                bfiVar4 = bfiVar;
            } finally {
            }
        } else {
            mne mneVar2 = mne.a;
            int i2 = this.d;
            try {
                try {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            obj4 = (atk) this.b;
                            obj5 = this.a;
                            atkVar4 = (atk) this.h;
                            try {
                                mjo.o(obj);
                                a.p((AtomicReference) ((atk) obj4).a, atkVar4);
                                ((ncd) obj5).d();
                                return obj;
                            } catch (Throwable th5) {
                                th = th5;
                                a.p((AtomicReference) ((atk) obj4).a, atkVar4);
                                throw th;
                            }
                        }
                        Object obj12 = this.c;
                        mohVar = (moh) this.b;
                        obj3 = this.a;
                        atkVar = (atk) this.h;
                        mjo.o(obj);
                        obj2 = obj12;
                    } else {
                        mjo.o(obj);
                        msw mswVar2 = (msw) this.h;
                        Enum r52 = this.f;
                        mmz mmzVar2 = mswVar2.b().get(muf.c);
                        mmzVar2.getClass();
                        atkVar = new atk((xe) r52, (muf) mmzVar2);
                        Object obj13 = this.g;
                        do {
                            atkVar2 = (atk) obj13;
                            atkVar3 = (atk) ((AtomicReference) atkVar2.a).get();
                            if (atkVar3 != null) {
                                if (((xe) atkVar.a).compareTo((xe) atkVar3.a) < 0) {
                                    throw new CancellationException("Current mutation had a higher priority");
                                }
                            }
                        } while (!a.o((AtomicReference) atkVar2.a, atkVar3, atkVar));
                        if (atkVar3 != null) {
                            atkVar3.b.s(new xf());
                        }
                        obj2 = this.g;
                        moh mohVar4 = this.e;
                        this.h = atkVar;
                        obj3 = ((atk) obj2).b;
                        this.a = obj3;
                        this.b = mohVar4;
                        this.c = obj2;
                        this.d = 1;
                        if (((ncd) obj3).b(this) != mneVar2) {
                            mohVar = mohVar4;
                        } else {
                            return mneVar2;
                        }
                    }
                    this.h = atkVar4;
                    this.a = obj3;
                    this.b = obj2;
                    this.c = null;
                    this.d = 2;
                    Object a2 = mohVar.a(this);
                    if (a2 != mneVar2) {
                        obj4 = obj2;
                        obj = a2;
                        obj5 = obj3;
                        a.p((AtomicReference) ((atk) obj4).a, atkVar4);
                        ((ncd) obj5).d();
                        return obj;
                    }
                    return mneVar2;
                } catch (Throwable th6) {
                    obj4 = obj2;
                    th = th6;
                    a.p((AtomicReference) ((atk) obj4).a, atkVar4);
                    throw th;
                }
                atkVar4 = atkVar;
            } finally {
            }
        }
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        if (this.i != 0) {
            Enum r0 = this.f;
            vr vrVar = (vr) r0;
            xg xgVar = new xg(vrVar, (bfi) this.g, this.e, mmxVar, 1);
            xgVar.h = obj;
            return xgVar;
        }
        Enum r02 = this.f;
        xe xeVar = (xe) r02;
        xg xgVar2 = new xg(xeVar, (atk) this.g, this.e, mmxVar, 0);
        xgVar2.h = obj;
        return xgVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg(xe xeVar, atk atkVar, moh mohVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.i = i;
        this.f = xeVar;
        this.g = atkVar;
        this.e = mohVar;
    }
}
