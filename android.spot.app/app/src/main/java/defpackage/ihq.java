package defpackage;

import com.google.android.gms.findmydevice.spot.GetOwnerKeyResponse;
import com.google.android.gms.findmydevice.spot.ImportGivenOwnerKeyResponse;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ihq implements jei {
    private final /* synthetic */ int a;

    public /* synthetic */ ihq(int i) {
        this.a = i;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        switch (this.a) {
            case 0:
                return null;
            case 1:
                lae laeVar = (lae) obj;
                kyf kyfVar = laeVar.b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                return new ihb(kyfVar, jis.o(laeVar.a));
            case 2:
                return ((ihx) obj).g;
            case 3:
                return ((ihx) obj).name();
            case 4:
                return null;
            case 5:
                return Boolean.valueOf(((ImportGivenOwnerKeyResponse) obj).a);
            case 6:
                GetOwnerKeyResponse getOwnerKeyResponse = (GetOwnerKeyResponse) obj;
                byte[] bArr = getOwnerKeyResponse.b;
                if (bArr != null && (bArr.length != 0 || getOwnerKeyResponse.a != 0)) {
                    ljh k = ijf.d.k();
                    lim t = lim.t(getOwnerKeyResponse.b);
                    if (!k.b.y()) {
                        k.t();
                    }
                    ljn ljnVar = k.b;
                    ijf ijfVar = (ijf) ljnVar;
                    ijfVar.a |= 1;
                    ijfVar.b = t;
                    int i = getOwnerKeyResponse.a;
                    if (!ljnVar.y()) {
                        k.t();
                    }
                    ijf ijfVar2 = (ijf) k.b;
                    ijfVar2.a |= 4;
                    ijfVar2.c = i;
                    return jer.i((ijf) k.q());
                }
                return jdl.a;
            case 7:
                return hzc.z((Collection) obj);
            case 8:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return new jvh(entry);
            case 9:
                Map.Entry entry2 = (Map.Entry) obj;
                entry2.getClass();
                return new jvl(entry2);
            case 10:
                Collection collection = (Collection) obj;
                jvv jvvVar = jvv.a;
                return (String[]) collection.toArray(new String[collection.size()]);
            case 11:
                jyy jyyVar = jxp.a;
                return ((jxp) obj).d;
            case 12:
                int i2 = jyr.a;
                return Boolean.valueOf(((List) obj).contains(String.class));
            case 13:
                int i3 = jyr.a;
                return Boolean.valueOf(((List) obj).contains(Throwable.class));
            default:
                int i4 = jyr.a;
                return Arrays.asList(((Constructor) obj).getParameterTypes());
        }
    }
}
