package defpackage;

import android.net.Uri;
import com.google.android.gms.findmydevice.spot.ChangeFindMyDeviceSettingsRequest;
import com.google.android.gms.findmydevice.spot.FindMyDeviceNetworkSettings;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class etm implements jxc {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ etm(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [dyu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, gbf] */
    @Override // defpackage.jxc
    public final jyz a() {
        int D;
        jyz m;
        jyz m2;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                etq etqVar = (etq) this.a;
                etqVar.p((eto) obj, 3).get();
                ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest = new ChangeFindMyDeviceSettingsRequest();
                FindMyDeviceNetworkSettings findMyDeviceNetworkSettings = new FindMyDeviceNetworkSettings();
                findMyDeviceNetworkSettings.a = 1;
                changeFindMyDeviceSettingsRequest.d = findMyDeviceNetworkSettings;
                fma.g(changeFindMyDeviceSettingsRequest);
                return fzo.b(etqVar.m.a(changeFindMyDeviceSettingsRequest));
            case 1:
                return ((jer) this.b).c().a((lor) this.a);
            case 2:
                return ((etq) this.a).p((eto) this.b, 1);
            case 3:
                Object obj2 = this.b;
                etq etqVar2 = (etq) this.a;
                etqVar2.p((eto) obj2, 5).get();
                ChangeFindMyDeviceSettingsRequest changeFindMyDeviceSettingsRequest2 = new ChangeFindMyDeviceSettingsRequest();
                changeFindMyDeviceSettingsRequest2.b = true;
                fma.g(changeFindMyDeviceSettingsRequest2);
                return fzo.b(etqVar2.m.a(changeFindMyDeviceSettingsRequest2));
            case 4:
                gaz gazVar = (gaz) this.b;
                ArrayList arrayList = new ArrayList(gazVar.b.size());
                Iterator it = gazVar.b.iterator();
                while (it.hasNext()) {
                    arrayList.add(((gbb) it.next()).a(this.a));
                }
                int i = 7;
                jyz a = ivc.S(arrayList).a(new csf(arrayList, 7), gazVar.a);
                if (gazVar.c.g()) {
                    return jwu.h(((gba) gazVar.c.c()).a(), new eji(a, i), gazVar.a);
                }
                return a;
            case 5:
                return ivc.E((InputStream) ((kpb) ((gok) this.a).a).n((Uri) this.b, new ikt(2)));
            case 6:
                hsf hsfVar = (hsf) this.b;
                return hsfVar.b(((hsc) hsfVar.d.a()).c(this.a));
            case 7:
                hso hsoVar = (hso) this.b;
                if (!hsoVar.a.c(null)) {
                    return jyv.a;
                }
                ljh ljhVar = (ljh) this.a;
                neh nehVar = (neh) ljhVar.b;
                int i2 = nehVar.r;
                int D2 = a.D(i2);
                if (((D2 != 0 && D2 == 3) || ((D = a.D(i2)) != 0 && D == 2)) && (nehVar.a & 16) == 0) {
                    return jyv.a;
                }
                hsh hshVar = (hsh) hsoVar.b.a();
                jer jerVar = hshVar.b;
                jer jerVar2 = hshVar.a;
                jyz E = ivc.E(jdl.a);
                jyz E2 = ivc.E(jdl.a);
                return ivc.R(E, E2).b(new igf(hsoVar, ljhVar, E, E2, 1), jxv.a);
            case 8:
                Object obj3 = this.a;
                ilp ilpVar = (ilp) obj3;
                Uri uri = (Uri) ivc.M(ilpVar.b);
                iki ikiVar = new iki((Closeable) ilpVar.g.n(uri, new iks(false, false)));
                Object obj4 = this.b;
                try {
                    try {
                        ((ilp) obj3).e(uri);
                        m = jyv.a;
                    } catch (Throwable th) {
                        try {
                            ikiVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    if (ilp.g(e)) {
                        m = ivc.D(e);
                    } else {
                        m = ((jck) obj4).m(e, ((ilp) obj3).d);
                    }
                }
                jyz b = ilp.b(m, ikiVar.a());
                ikiVar.close();
                return b;
            default:
                Object obj5 = this.a;
                ilz ilzVar = (ilz) obj5;
                Uri uri2 = (Uri) ivc.M(ilzVar.b);
                iki ikiVar2 = new iki((Closeable) ilzVar.l.n(uri2, new iks(false, false)));
                Object obj6 = this.b;
                try {
                    try {
                        ((ilz) obj5).c(uri2);
                        m2 = jyv.a;
                    } catch (IOException e2) {
                        if (ilz.d(e2)) {
                            m2 = ivc.D(e2);
                        } else {
                            m2 = ((jck) obj6).m(e2, ((ilz) obj5).e);
                        }
                    }
                    jyz b2 = ilz.b(m2, ikiVar2.a(), ((ilz) obj5).c);
                    ikiVar2.close();
                    return b2;
                } catch (Throwable th3) {
                    try {
                        ikiVar2.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
        }
    }

    public /* synthetic */ etm(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
