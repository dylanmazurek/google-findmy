package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhx implements mar {
    final /* synthetic */ map a;
    final /* synthetic */ mas b;
    private final /* synthetic */ int c;

    public /* synthetic */ mhx(mhw mhwVar, map mapVar, int i) {
        this.c = i;
        this.b = mhwVar;
        this.a = mapVar;
    }

    @Override // defpackage.mar
    public final void a(lzf lzfVar) {
        maq mhzVar;
        lze lzeVar;
        if (this.c != 0) {
            map mapVar = this.a;
            mhw mhwVar = (mhw) this.b;
            mhv mhvVar = (mhv) mhwVar.f.get(mhw.h(mapVar));
            if (mhvVar != null && mhvVar.a == mapVar && (lzeVar = lzfVar.a) != lze.SHUTDOWN) {
                if (lzeVar == lze.IDLE) {
                    mhwVar.e.d();
                }
                mhvVar.b(lzeVar);
                lze lzeVar2 = mhwVar.j;
                lze lzeVar3 = lze.TRANSIENT_FAILURE;
                if (lzeVar2 == lzeVar3 || mhwVar.k == lzeVar3) {
                    if (lzeVar != lze.CONNECTING) {
                        if (lzeVar == lze.IDLE) {
                            mhwVar.e();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                int ordinal = lzeVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            if (ordinal == 3) {
                                mhwVar.g.d();
                                lze lzeVar4 = lze.IDLE;
                                mhwVar.j = lzeVar4;
                                mhwVar.f(lzeVar4, new mhu(mhwVar, mhwVar));
                                return;
                            }
                            throw new IllegalArgumentException("Unsupported state:".concat(lzeVar.toString()));
                        }
                        if (mhwVar.g.g() && ((mhv) mhwVar.f.get(mhwVar.g.c())).a == mapVar && mhwVar.g.f()) {
                            mhwVar.d();
                            mhwVar.e();
                        }
                        mhr mhrVar = mhwVar.g;
                        if (mhrVar != null && !mhrVar.g() && mhwVar.f.size() >= mhwVar.g.a()) {
                            Iterator it = mhwVar.f.values().iterator();
                            while (it.hasNext()) {
                                if (!((mhv) it.next()).d) {
                                    return;
                                }
                            }
                            lze lzeVar5 = lze.TRANSIENT_FAILURE;
                            mhwVar.j = lzeVar5;
                            mhwVar.f(lzeVar5, new mht(mam.a(lzfVar.b)));
                            int i = mhwVar.h + 1;
                            mhwVar.h = i;
                            if (i >= mhwVar.g.a() || mhwVar.i) {
                                mhwVar.i = false;
                                mhwVar.h = 0;
                                mhwVar.e.d();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    mhwVar.d();
                    for (mhv mhvVar2 : mhwVar.f.values()) {
                        if (!mhvVar2.a.equals(mhvVar.a)) {
                            mhvVar2.a.b();
                        }
                    }
                    mhwVar.f.clear();
                    mhvVar.b(lze.READY);
                    mhwVar.f.put(mhw.h(mhvVar.a), mhvVar);
                    mhwVar.g.h(mhw.h(mapVar));
                    mhwVar.j = lze.READY;
                    mhwVar.g(mhvVar);
                    return;
                }
                lze lzeVar6 = lze.CONNECTING;
                mhwVar.j = lzeVar6;
                mhwVar.f(lzeVar6, new mht(mam.a));
                return;
            }
            return;
        }
        lze lzeVar7 = lzfVar.a;
        if (lzeVar7 != lze.SHUTDOWN) {
            mas masVar = this.b;
            if (lzeVar7 == lze.TRANSIENT_FAILURE || lzeVar7 == lze.IDLE) {
                ((mib) masVar).d.d();
            }
            mib mibVar = (mib) masVar;
            if (mibVar.f == lze.TRANSIENT_FAILURE) {
                if (lzeVar7 != lze.CONNECTING) {
                    if (lzeVar7 == lze.IDLE) {
                        map mapVar2 = mibVar.e;
                        if (mapVar2 != null) {
                            mapVar2.a();
                            return;
                        }
                        return;
                    }
                } else {
                    return;
                }
            }
            map mapVar3 = this.a;
            int ordinal2 = lzeVar7.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        if (ordinal2 == 3) {
                            mhzVar = new mia(mibVar, mapVar3);
                        } else {
                            throw new IllegalArgumentException("Unsupported state:".concat(lzeVar7.toString()));
                        }
                    } else {
                        mhzVar = new mhz(mam.a(lzfVar.b));
                    }
                } else {
                    mhzVar = new mhz(mam.b(mapVar3));
                }
            } else {
                mhzVar = new mhz(mam.a);
            }
            mibVar.d(lzeVar7, mhzVar);
        }
    }

    public mhx(mib mibVar, map mapVar, int i) {
        this.c = i;
        this.a = mapVar;
        this.b = mibVar;
    }
}
