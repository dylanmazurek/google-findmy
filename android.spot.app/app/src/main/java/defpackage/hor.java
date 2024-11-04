package defpackage;

import android.os.Build;
import j$.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hor implements lsh {
    private final mko a;
    private final mko b;
    private final /* synthetic */ int c;

    public hor(mko mkoVar, mko mkoVar2, int i) {
        this.c = i;
        this.a = mkoVar;
        this.b = mkoVar2;
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        Object obj;
        Collection collection;
        Object obj2;
        switch (this.c) {
            case 0:
                ((dvv) this.a).b();
                if (a.g()) {
                    obj = new jms((hpg) this.b.a());
                } else {
                    obj = jmo.a;
                }
                obj.getClass();
                return obj;
            case 1:
                return new hri(((hnm) this.a).a(), ((lry) this.b).b(), (byte[]) null);
            case 2:
                if (!((jer) ((lsi) this.a).b).g()) {
                    collection = jmo.a;
                } else if (Build.VERSION.SDK_INT >= 23) {
                    collection = new jms((hpg) this.b.a());
                } else {
                    collection = jmo.a;
                }
                collection.getClass();
                return collection;
            case 3:
                ((dvv) this.a).b();
                return new jms((hpg) this.b.a());
            case 4:
                jer jerVar = (jer) ((lsi) this.a).b;
                if (a.g() && jerVar.g()) {
                    obj2 = new jms((hpg) this.b.a());
                } else {
                    obj2 = jmo.a;
                }
                obj2.getClass();
                return obj2;
            case 5:
                ((dvv) this.a).b();
                return new jms((hpg) this.b.a());
            case 6:
                mko mkoVar = this.a;
                return new htb(((hte) mkoVar).a());
            case 7:
                return new hzb(((lry) this.b).b(), (jzc) this.a.a());
            case 8:
                return new hzh((jer) ((lsi) this.b).b, ((lsk) this.a).a());
            case 9:
                return new hzm(this.a);
            case 10:
                return new kuv(((ibt) this.b).a(), ((idc) this.a).a(), (byte[]) null);
            case 11:
                mko mkoVar2 = this.b;
                return new kuv((igh) this.a.a(), ((igp) mkoVar2).a());
            case 12:
                return new iym(((lry) this.a).b(), (jck) this.b.a());
            case 13:
                return new ktn(((iak) this.b).a(), jis.o((Set) this.a.a()));
            default:
                ExperimentalCronetEngine experimentalCronetEngine = (ExperimentalCronetEngine) this.b.a();
                Iterator it = ((Set) ((lsi) this.a).b).iterator();
                while (it.hasNext()) {
                    experimentalCronetEngine.addRequestFinishedListener((RequestFinishedInfo.Listener) it.next());
                }
                experimentalCronetEngine.getClass();
                return experimentalCronetEngine;
        }
    }

    public hor(mko mkoVar, mko mkoVar2, int i, float[] fArr) {
        this.c = i;
        this.b = mkoVar;
        this.a = mkoVar2;
    }
}
