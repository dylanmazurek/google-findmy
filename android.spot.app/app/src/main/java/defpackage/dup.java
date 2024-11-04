package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.accounts.AccountLayout;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dup implements jyj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dup(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r12v11, types: [hir, java.lang.Object] */
    @Override // defpackage.jyj
    public final void a(Throwable th) {
        pf pfVar;
        switch (this.b) {
            case 0:
                return;
            case 1:
                dyq dyqVar = ((dul) this.a).d;
                if (dyqVar != null) {
                    dyqVar.f(false);
                }
                ((dul) this.a).c = false;
                return;
            case 2:
                if (th instanceof dfg) {
                    Object obj = this.a;
                    Intent intent = ((dfg) th).a;
                    if (intent != null && (pfVar = ((dyo) obj).f) != null) {
                        pfVar.b(intent);
                    }
                }
                ((jni) ((jni) ((jni) dyo.b.f()).i(th)).j("com/google/android/apps/adm/controllers/DeviceListController$1", "onFailure", (char) 248, "DeviceListController.java")).r("Fetching devices failed.");
                return;
            case 3:
                ((jni) ((jni) ((jni) dyt.b.f()).i(th)).j("com/google/android/apps/adm/controllers/WelcomeController$2", "onFailure", 'v', "WelcomeController.java")).r("Failed to get ToS version to show.");
                return;
            case 4:
                ((jni) ((jni) ((jni) dyw.a.f()).i(th)).j("com/google/android/apps/adm/deeplink/DeepLinkHandlerImpl$1", "onFailure", 'Z', "DeepLinkHandlerImpl.java")).r("Failed parsing FDL");
                return;
            case 5:
                ((ehk) this.a).f.l(new ehj(jdl.a, false, false));
                ((ehk) this.a).i.m(R.string.snackbar_mark_as_found_failed);
                ((jni) ((jni) ((jni) ehk.a.f()).i(th)).j("com/google/android/apps/adm/integrations/android/securedevice/SecureDeviceViewModel$1", "onFailure", (char) 185, "SecureDeviceViewModel.java")).r("Mark as found failed");
                return;
            case 6:
                ((jni) ((jni) ((jni) ejo.a.g()).i(th)).j("com/google/android/apps/adm/integrations/spot/OwnerKeyHandler$1", "onFailure", (char) 412, "OwnerKeyHandler.java")).r("Exception when retrieving owner key");
                return;
            case 7:
                ((jni) ((jni) ((jni) esa.a.f()).i(th)).j("com/google/android/apps/adm/integrations/spot/ownerkey/OwnerKeyCacheImpl$1", "onFailure", 'S', "OwnerKeyCacheImpl.java")).r("Error re-caching owner key.");
                synchronized (((esa) this.a).c) {
                    Object obj2 = this.a;
                    jdl jdlVar = jdl.a;
                    ((esa) obj2).e = jdlVar;
                    ((esa) obj2).d = jdlVar;
                }
                return;
            case 8:
                Log.e(hba.a, "Failed to load owners", th);
                return;
            case 9:
                Log.w("AvatarRetriever", "Failed to load avatar.", th);
                this.a.a(null);
                return;
            case 10:
                Log.e("OneGoogle", "Failed to load accounts", th);
                ((hke) this.a).b.c(new Account[0]);
                return;
            case 11:
                return;
            case 12:
                ((jni) ((jni) ((jni) hyg.c.g()).i(th)).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl$1", "onFailure", (char) 253, "PrecisionFindingImpl.java")).r("Failed to get ranging technologies availability");
                ((hyg) this.a).d(0);
                return;
            case 13:
                if (!(th instanceof iek) && !(th instanceof iea)) {
                    ((jni) ((jni) ((jni) hyg.c.g()).i(th)).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl$3", "onFailure", (char) 498, "PrecisionFindingImpl.java")).r("Failed to send set config message");
                    ((hyg) this.a).d(1);
                    return;
                } else {
                    ((hyg) this.a).d(3);
                    ((jni) ((jni) ((jni) hyg.c.e()).i(th)).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl$3", "onFailure", (char) 494, "PrecisionFindingImpl.java")).r("Failed to send set config message -- incompatible devices");
                    return;
                }
            case 14:
                ((jni) ((jni) ((jni) hzb.a.g()).i(th)).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter$1", "onFailure", (char) 179, "UwbAdapter.java")).r("Failed UWB startRanging call.");
                synchronized (((hzb) this.a).f) {
                    Object obj3 = this.a;
                    if (((hzb) obj3).h == 1) {
                        return;
                    }
                    ((izl) ((hzb) obj3).e.get()).b();
                    ((hzb) this.a).h = 1;
                    ((hzb) this.a).a();
                    return;
                }
            case 15:
                ((jni) ((jni) ((jni) hzb.a.g()).i(th)).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter$2", "onFailure", (char) 208, "UwbAdapter.java")).r("Failed UWB stopRanging call.");
                synchronized (((hzb) this.a).f) {
                    Object obj4 = this.a;
                    if (((hzb) obj4).h == 1) {
                        return;
                    }
                    ((hzb) obj4).h = 1;
                    ((izl) ((hzb) obj4).e.get()).b();
                    ((hzb) this.a).a();
                    return;
                }
            case 16:
            case 17:
                return;
            case 18:
                if (!(th instanceof ieq)) {
                    ((jni) ((jni) ((jni) ifo.a.g().h(flv.a, 284)).i(th)).j("com/google/android/libraries/spot/ble/RingerControlImpl$1", "onFailure", (char) 517, "RingerControlImpl.java")).r("Ringing operation failed with unexpected exception");
                    ((ifo) this.a).f(jdl.a);
                    return;
                } else {
                    ieq ieqVar = (ieq) th;
                    ((ifo) this.a).f(jer.i(ieqVar.a(ieqVar.getMessage())));
                    return;
                }
            default:
                ((kuk) this.a).a.i(new kuj(2, null, th));
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [hir, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v85, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.jyj
    public final /* synthetic */ void b(Object obj) {
        jiy B;
        int i = 0;
        int i2 = 1;
        switch (this.b) {
            case 0:
                Bitmap bitmap = (Bitmap) obj;
                RectF rectF = new RectF();
                rectF.set(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setShader(new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP));
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(createBitmap).drawOval(rectF, paint);
                kgf kgfVar = (kgf) this.a;
                elo eloVar = (elo) ((apc) kgfVar.a).a;
                Object obj2 = eloVar.b;
                Object obj3 = kgfVar.c;
                ((sn) obj2).c(obj3, createBitmap);
                dfh dfhVar = new dfh();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                dfhVar.a = byteArrayOutputStream.toByteArray();
                ((dgg) eloVar.a).g((String) obj3, dfhVar);
                Object obj4 = ((kgf) this.a).b;
                if (obj4 != null) {
                    ((AccountLayout) obj4).a(createBitmap);
                    return;
                }
                return;
            case 1:
                jis jisVar = (jis) obj;
                dvh dvhVar = new dvh(i2);
                if (jisVar instanceof Collection) {
                    B = hzc.B(jisVar.iterator(), dvhVar, jiy.h(jisVar.size()));
                } else {
                    B = hzc.B(jisVar.iterator(), dvhVar, new jiu());
                }
                dul dulVar = (dul) this.a;
                dulVar.b = B;
                jjr keySet = dulVar.b.keySet();
                if (!dulVar.a.isEmpty()) {
                    for (Map.Entry entry : dulVar.a.entrySet()) {
                        dulVar.d((String) entry.getKey(), (AccountLayout) entry.getValue());
                    }
                    dulVar.a.clear();
                } else {
                    Iterator<E> it = keySet.iterator();
                    while (it.hasNext()) {
                        dulVar.e.s((String) it.next(), null);
                    }
                }
                dyq dyqVar = ((dul) this.a).d;
                if (dyqVar != null) {
                    dyqVar.f(true);
                }
                ((dul) this.a).c = false;
                return;
            case 2:
                Object obj5 = this.a;
                ((dyo) obj5).h.d(new dyl((dxu) obj5, i));
                return;
            case 3:
                jer jerVar = (jer) obj;
                njz njzVar = ((dyt) this.a).g;
                if (njzVar != null) {
                    if (!jerVar.g()) {
                        ((dyq) njzVar.a).k.set(true);
                        return;
                    }
                    Object obj6 = njzVar.a;
                    if (((dxu) obj6).a) {
                        ebf ebfVar = (ebf) ((dyq) obj6).g.a();
                        boolean c = fyo.c((ContentResolver) ((elo) ((dyq) njzVar.a).i.a()).a, "adm:show_special_disclosure_for_south_korea", false);
                        int intValue = ((Integer) jerVar.c()).intValue();
                        if (ebfVar.a().f("welcome_dialog") == null) {
                            ecn ecnVar = new ecn();
                            Bundle bundle = new Bundle();
                            bundle.putBoolean("showSpecialDisclosureForSouthKorea", c);
                            bundle.putInt("serverTosVersion", intValue);
                            ecnVar.ak(bundle);
                            ecnVar.q(ebfVar.a(), "welcome_dialog");
                            ebfVar.a().ag();
                            ((bym) ((dyq) njzVar.a).h.a()).k(dxp.WELCOME);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ktd ktdVar = (ktd) obj;
                if (ktdVar != null && ktdVar.V() != null) {
                    ((jni) ((jni) dyw.a.c()).j("com/google/android/apps/adm/deeplink/DeepLinkHandlerImpl$1", "onSuccess", 79, "DeepLinkHandlerImpl.java")).r("Successfully parsed FDL");
                    synchronized (((dyw) this.a).d) {
                        Object obj7 = this.a;
                        Uri V = ktdVar.V();
                        V.getClass();
                        ((dyw) obj7).b(V);
                    }
                    return;
                }
                ((jni) ((jni) dyw.a.c()).j("com/google/android/apps/adm/deeplink/DeepLinkHandlerImpl$1", "onSuccess", 84, "DeepLinkHandlerImpl.java")).r("FDL returned a null long link");
                return;
            case 5:
                ((ehk) this.a).f.l(new ehj(jdl.a, false, true));
                return;
            case 6:
                ejn ejnVar = (ejn) obj;
                if (!ejnVar.equals(((ejo) this.a).h.d())) {
                    ((ejo) this.a).h.l(ejnVar);
                    return;
                }
                return;
            case 7:
                return;
            case 8:
                ((hba) this.a).b.g((jis) obj);
                return;
            case 9:
                this.a.a((Bitmap) obj);
                return;
            case 10:
                ((hke) this.a).b.c((Account[]) ((List) obj).toArray(new Account[0]));
                return;
            case 11:
                Iterator it2 = ((List) obj).iterator();
                while (it2.hasNext()) {
                    ((hkl) this.a).h((Account) it2.next());
                }
                return;
            case 12:
                jiy jiyVar = (jiy) obj;
                ((jni) ((jni) hyg.c.e()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl$1", "onSuccess", 246, "PrecisionFindingImpl.java")).u("Got Ranging Technologies availability: %s", jiyVar);
                Object obj8 = this.a;
                hyg hygVar = (hyg) obj8;
                synchronized (hygVar.e) {
                    if (((hyg) obj8).p == 2) {
                        if (!jiyVar.containsValue(2)) {
                            if (jiyVar.containsKey(hyh.UWB) && ((Integer) jiyVar.get(hyh.UWB)).intValue() == 1) {
                                hygVar.d(4);
                            } else if (jiyVar.containsKey(hyh.CS) && ((Integer) jiyVar.get(hyh.CS)).intValue() == 1) {
                                hygVar.d(5);
                            } else {
                                hygVar.d(3);
                            }
                        } else {
                            Stream map = Collection.EL.stream(jiyVar.entrySet()).filter(new eju(17)).map(new evl(6));
                            int i3 = jis.d;
                            hygVar.i = (jis) map.collect(jgr.a);
                            ((jni) ((jni) hyg.c.e()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl", "processAvailabilityResult", 293, "PrecisionFindingImpl.java")).u("Ranging technologies enabled on this device: %s", hygVar.i);
                        }
                    }
                }
                Object obj9 = this.a;
                hyg hygVar2 = (hyg) obj9;
                synchronized (hygVar2.e) {
                    if (((hyg) obj9).p != 2) {
                        return;
                    }
                    ((hyg) obj9).p = 3;
                    hri hriVar = hygVar2.r;
                    jis jisVar2 = hygVar2.i;
                    if (jisVar2 != null) {
                        jis jisVar3 = new hyi(jisVar2).a;
                        ico icoVar = ico.RANGING_CAPABILITY_REQUEST;
                        byte[] bArr = {hyh.a(jisVar3)};
                        Object obj10 = hriVar.b;
                        nca ncaVar = (nca) hriVar.a;
                        ivc.N(ncaVar.g(icoVar, bArr, (kyf) obj10).e(new jei() { // from class: ifd
                            @Override // defpackage.jei
                            public final Object a(Object obj11) {
                                Object obj12;
                                Object obj13;
                                boolean z;
                                boolean z2;
                                byte[] bArr2 = (byte[]) obj11;
                                int length = bArr2.length;
                                if (length >= 2) {
                                    boolean z3 = false;
                                    byte b = bArr2[0];
                                    byte b2 = bArr2[1];
                                    int i4 = b2 + 2;
                                    if (length >= i4) {
                                        lim u = lim.u(bArr2, 2, b2);
                                        jin jinVar = new jin();
                                        hyo hyoVar = null;
                                        while (true) {
                                            int length2 = bArr2.length;
                                            if (i4 < length2) {
                                                jis b3 = hyh.b(bArr2[i4]);
                                                if (((jmi) b3).c == 1) {
                                                    int ordinal = ((hyh) b3.get(0)).ordinal();
                                                    if (ordinal != 0) {
                                                        if (ordinal == 1) {
                                                            throw new UnsupportedOperationException("Not implemented");
                                                        }
                                                    } else {
                                                        byte[] copyOfRange = Arrays.copyOfRange(bArr2, i4, length2);
                                                        if (copyOfRange.length >= 18) {
                                                            jis b4 = hyh.b(copyOfRange[0]);
                                                            if (((jmi) b4).c != 1 || b4.get(0) != hyh.UWB) {
                                                                break;
                                                            }
                                                            ftq ftqVar = new ftq(Arrays.copyOfRange(copyOfRange, 1, 3));
                                                            jis f = hrb.f(Arrays.copyOfRange(copyOfRange, 3, 7), 0);
                                                            jis f2 = hrb.f(Arrays.copyOfRange(copyOfRange, 7, 11), 1);
                                                            jis f3 = hrb.f(Arrays.copyOfRange(copyOfRange, 11, 13), 0);
                                                            int e = hrb.e(Arrays.copyOfRange(copyOfRange, 13, 17));
                                                            int e2 = hrb.e(Arrays.copyOfRange(copyOfRange, 17, 18));
                                                            if (f != null) {
                                                                if (f3 != null) {
                                                                    if (f2 != null) {
                                                                        hyoVar = new hyo(ftqVar, f, f2, f3, e, e2);
                                                                        jinVar.h(hyh.UWB);
                                                                        i4 += 18;
                                                                    } else {
                                                                        throw new NullPointerException("Null supportedPreambleIndexes");
                                                                    }
                                                                } else {
                                                                    throw new NullPointerException("Null supportedConfigIds");
                                                                }
                                                            } else {
                                                                throw new NullPointerException("Null supportedChannels");
                                                            }
                                                        } else {
                                                            throw new IllegalArgumentException("Couldn't parse UwbCapabilities, invalid byte size");
                                                        }
                                                    }
                                                } else {
                                                    throw new IllegalArgumentException("Failed to parse Capability Response Message, Invalid ranging technology Id. Bytes:".concat(String.valueOf(Arrays.toString(bArr2))));
                                                }
                                            } else {
                                                hyj hyjVar = new hyj();
                                                hyjVar.b(lim.b);
                                                hyjVar.a(jmi.a);
                                                hyjVar.a = b;
                                                hyjVar.b = (byte) 1;
                                                hyjVar.b(u);
                                                hyjVar.e = hyoVar;
                                                hyjVar.a(jinVar.g());
                                                if (hyjVar.b == 1 && (obj12 = hyjVar.c) != null && (obj13 = hyjVar.d) != null) {
                                                    hyk hykVar = new hyk(hyjVar.a, (lim) obj12, (jis) obj13, (hyo) hyjVar.e);
                                                    boolean contains = hykVar.a.contains(hyh.UWB);
                                                    if (hykVar.b == null) {
                                                        z = false;
                                                    } else {
                                                        z = true;
                                                    }
                                                    if (contains == z) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    hwx.K(z2, "Priority list doesn't match UWB capabilities set.");
                                                    hwx.K(!hykVar.a.contains(hyh.CS), "Priority list doesn't match CS capabilities set.");
                                                    jis jisVar4 = hykVar.a;
                                                    EnumSet noneOf = EnumSet.noneOf(hyh.class);
                                                    hzc.aa(noneOf, jisVar4);
                                                    if (((jmi) jisVar4).c == noneOf.size()) {
                                                        z3 = true;
                                                    }
                                                    hwx.K(z3, "Priority list contains duplicates.");
                                                    return hykVar;
                                                }
                                                StringBuilder sb = new StringBuilder();
                                                if (hyjVar.b == 0) {
                                                    sb.append(" supportedProtocolVersion");
                                                }
                                                if (hyjVar.c == null) {
                                                    sb.append(" vendorData");
                                                }
                                                if (hyjVar.d == null) {
                                                    sb.append(" rangingTechnologiesPriority");
                                                }
                                                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                                            }
                                        }
                                        throw new IllegalArgumentException("Couldn't parse UwbCapabilities, invalid technology id");
                                    }
                                    throw new IllegalArgumentException("Failed to parse Capability Response Message, Invalid vendor size. Bytes:".concat(String.valueOf(Arrays.toString(bArr2))));
                                }
                                throw new IllegalArgumentException("Failed to parse Capability Response Message, Invalid size. Bytes:".concat(String.valueOf(Arrays.toString(bArr2))));
                            }
                        }, ncaVar.e), new hye(hygVar2), hygVar2.d);
                        return;
                    }
                    throw new NullPointerException("Null requestedRangingTechnologies");
                }
            case 13:
                hym hymVar = (hym) obj;
                if (hymVar.a.isEmpty()) {
                    ((jni) ((jni) hyg.c.g()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl$3", "onSuccess", 475, "PrecisionFindingImpl.java")).r("Other device failed to set all configs, or failed to start if requested.");
                    ((hyg) this.a).d(1);
                    return;
                }
                ((jni) ((jni) hyg.c.e()).j("com/google/android/libraries/precisionfinding/PrecisionFindingImpl$3", "onSuccess", 480, "PrecisionFindingImpl.java")).u("Successfully set config: %s", hymVar.a);
                synchronized (((hyg) this.a).e) {
                    ((hyg) this.a).m = true;
                }
                ((hyg) this.a).c();
                return;
            case 14:
                ((jni) ((jni) hzb.a.e()).j("com/google/android/libraries/precisionfinding/ranging/UwbAdapter$1", "onSuccess", 172, "UwbAdapter.java")).r("UWB startRanging call succeeded.");
                return;
            case 15:
                return;
            case 16:
                ((idt) this.a).n();
                return;
            case 17:
                Integer num = (Integer) obj;
                num.intValue();
                ifh ifhVar = ((ifg) this.a).a;
                synchronized (ifhVar.g) {
                    iff iffVar = ifhVar.h;
                    ifhVar.d(hqk.f(jer.i(num), iffVar.b, iffVar.c, iffVar.d));
                }
                return;
            case 18:
                ((ifo) this.a).f(jdl.a);
                return;
            default:
                ((kuk) this.a).a.i(new kuj(1, (jis) obj, null));
                return;
        }
    }
}
