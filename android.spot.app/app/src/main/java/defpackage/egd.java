package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.apps.adm.R;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class egd implements Function {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ egd(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public final /* synthetic */ Function andThen(Function function) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Function$CC.$default$andThen(this, function);
                            }
                            return Function$CC.$default$andThen(this, function);
                        }
                        return Function$CC.$default$andThen(this, function);
                    }
                    return Function$CC.$default$andThen(this, function);
                }
                return Function$CC.$default$andThen(this, function);
            }
            return Function$CC.$default$andThen(this, function);
        }
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v48, types: [euv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v56, types: [euv, java.lang.Object] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Drawable bitmapDrawable;
        Object obj2;
        int i;
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                dya dyaVar = (dya) obj;
                                hyj hyjVar = new hyj(null, null);
                                hyjVar.a = ((euz) this.a).d;
                                hyjVar.b = (byte) 1;
                                dxy dxyVar = dyaVar.a;
                                int ordinal = dxyVar.a().ordinal();
                                Object obj3 = this.b;
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            if (ordinal == 3) {
                                                bitmapDrawable = ((Context) ((gok) obj3).a).getDrawable(R.drawable.gs_account_circle_vd_theme_48);
                                            } else {
                                                throw new AssertionError("Unreachable");
                                            }
                                        } else {
                                            bitmapDrawable = ((Context) ((gok) obj3).a).getDrawable(dxyVar.c());
                                        }
                                    } else {
                                        Object obj4 = ((gok) obj3).a;
                                        int b = dxyVar.b() - 1;
                                        if (b != 3 && b != 4) {
                                            if (b != 6) {
                                                if (b != 7) {
                                                    if (b != 8) {
                                                        i = R.drawable.gs_smartphone_fill1_vd_theme_24;
                                                    } else {
                                                        i = R.drawable.gs_stylus_fill1_vd_theme_24;
                                                    }
                                                } else {
                                                    i = R.drawable.gs_headphones_fill1_vd_theme_24;
                                                }
                                            } else {
                                                i = R.drawable.gs_watch_fill1_vd_theme_24;
                                            }
                                        } else {
                                            i = R.drawable.gs_tablet_fill1_vd_theme_24;
                                        }
                                        bitmapDrawable = ((Context) obj4).getDrawable(i);
                                    }
                                } else {
                                    bitmapDrawable = new BitmapDrawable(((Context) ((gok) obj3).a).getResources(), dxyVar.d());
                                }
                                bitmapDrawable.getClass();
                                Drawable i3 = bpu.i(bitmapDrawable);
                                if (i3 != null) {
                                    hyjVar.e = i3;
                                    int ordinal2 = dyaVar.a.a().ordinal();
                                    if (ordinal2 != 1 && ordinal2 != 2) {
                                        if (ordinal2 == 3) {
                                            hyjVar.c(((gok) obj3).b.c());
                                        }
                                    } else {
                                        hyjVar.c(((gok) obj3).b.d());
                                    }
                                    if (hyjVar.b == 1 && (obj2 = hyjVar.e) != null) {
                                        return new euw((Drawable) obj2, hyjVar.a, (Optional) hyjVar.c, (Optional) hyjVar.d);
                                    }
                                    StringBuilder sb = new StringBuilder();
                                    if (hyjVar.e == null) {
                                        sb.append(" drawable");
                                    }
                                    if (hyjVar.b == 0) {
                                        sb.append(" diameter");
                                    }
                                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                }
                                throw new NullPointerException("Null drawable");
                            }
                            kyu kyuVar = (kyu) obj;
                            return ((end) this.a).b.a(kyuVar.a / 1.0E7d, kyuVar.b / 1.0E7d, this.b);
                        }
                        jiy jiyVar = ekh.am;
                        return eku.b((kzb) obj, (kyj) this.b, jer.i(this.a));
                    }
                    eit eitVar = (eit) ((Map.Entry) obj).getValue();
                    if (!eitVar.b() && !apc.q(eitVar.g, lua.d())) {
                        if (!apc.q(eitVar.f, lua.d() + ((hot) ((apc) this.b).c).j())) {
                            jer jerVar = ((eiv) this.a).i;
                            if (jerVar.g() && SystemClock.elapsedRealtime() - ((Long) jerVar.c()).longValue() <= lua.d()) {
                                return eis.SCANNING;
                            }
                            return eis.NOT_IN_RANGE;
                        }
                    }
                    return eis.IN_RANGE;
                }
                kyu kyuVar2 = (kyu) obj;
                return ((ejg) this.a).h.a(kyuVar2.a / 1.0E7d, kyuVar2.b / 1.0E7d, Collections.unmodifiableMap(((kzb) this.b).g));
            }
            lqc lqcVar = (lqc) obj;
            jer jerVar2 = jdl.a;
            if (lqcVar != null) {
                dzx dzxVar = (dzx) this.a;
                boolean z = dzxVar.g.z(lqcVar);
                lqd lqdVar = lqcVar.d;
                if (lqdVar == null) {
                    lqdVar = lqd.d;
                }
                boolean containsValue = dzxVar.f.n(lqdVar).containsValue(eis.IN_RANGE);
                kyf kyfVar = dzxVar.b.a(lqcVar).b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                kzc kzcVar = kyfVar.d;
                if (kzcVar == null) {
                    kzcVar = kzc.c;
                }
                boolean k = eku.k(kzcVar);
                lqd lqdVar2 = lqcVar.d;
                if (lqdVar2 == null) {
                    lqdVar2 = lqd.d;
                }
                etd etdVar = (etd) ((jiy) this.b).get(lqdVar2);
                if (etdVar != null) {
                    jerVar2 = etdVar.a;
                }
                return new dzs(lqcVar, z, containsValue, jerVar2, k);
            }
            throw new NullPointerException("Null device");
        }
        kyu kyuVar3 = (kyu) obj;
        return ((egh) this.a).d.a(kyuVar3.a / 1.0E7d, kyuVar3.b / 1.0E7d, Collections.unmodifiableMap(((lqq) this.b).d));
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return Function$CC.$default$compose(this, function);
                            }
                            return Function$CC.$default$compose(this, function);
                        }
                        return Function$CC.$default$compose(this, function);
                    }
                    return Function$CC.$default$compose(this, function);
                }
                return Function$CC.$default$compose(this, function);
            }
            return Function$CC.$default$compose(this, function);
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ egd(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
