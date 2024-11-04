package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gte extends mnp implements mol {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(cyb cybVar, Context context, String str, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = cybVar;
        this.a = context;
        this.c = str;
    }

    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                return ((gte) c((msw) obj, (mmx) obj2)).b(mlh.a);
            case 1:
                return ((gte) c((msw) obj, (mmx) obj2)).b(mlh.a);
            case 2:
                return ((gte) c((msw) obj, (mmx) obj2)).b(mlh.a);
            case 3:
                return ((gte) c((msw) obj, (mmx) obj2)).b(mlh.a);
            case 4:
                return ((gte) c((msw) obj, (mmx) obj2)).b(mlh.a);
            case 5:
                return ((gte) c((msw) obj, (mmx) obj2)).b(mlh.a);
            case 6:
                return ((gte) c((msw) obj, (mmx) obj2)).b(mlh.a);
            case 7:
                return ((gte) c((msw) obj, (mmx) obj2)).b(mlh.a);
            case 8:
                return ((gte) c((msw) obj, (mmx) obj2)).b(mlh.a);
            default:
                return ((gte) c((msw) obj, (mmx) obj2)).b(mlh.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v15, types: [lkq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [lkq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v19, types: [lkq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v21, types: [lkq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [lkq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25, types: [lkq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v27, types: [lkq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29, types: [lkq, java.lang.Object] */
    @Override // defpackage.mnj
    public final Object b(Object obj) {
        switch (this.d) {
            case 0:
                mjo.o(obj);
                try {
                    gwp gwpVar = (gwp) ((gtm) this.a).b.f();
                    if (gwpVar != null) {
                        Object obj2 = this.b;
                        switch ((lgp) obj2) {
                            case REGISTRATION_REASON_UNSPECIFIED:
                            case DEVICE_START:
                            case APP_UPDATED:
                            case ACCOUNT_CHANGED:
                            case SERVER_SYNC_INSTRUCTION:
                            case LOCALE_CHANGED:
                            case TIMEZONE_CHANGED:
                            case COLLABORATOR_API_CALL:
                            case GUNS_MIGRATION:
                            case REGISTRATION_ID_CHANGED:
                            case CHANNEL_BLOCK_STATE_CHANGED:
                            case GROWTHKIT_PERIODIC_REGISTRATION:
                            case PERIODIC_REGISTRATION:
                            case GMSCORE_DEBUG:
                                gwpVar.a();
                                break;
                            default:
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(obj2))));
                        }
                    }
                } catch (Exception e) {
                    ((jol) ((jol) gtm.a.g()).i(e)).r("Failed to execute YT pre-registration callback.");
                }
                return mlh.a;
            case 1:
                mjo.o(obj);
                for (cyn cynVar : ((cyb) this.b).b.values()) {
                    cynVar.getClass();
                    if (cynVar.e == null) {
                        String str = cynVar.d;
                        if (moz.I(str, "data:") && moz.y(str, "base64,", 0, 6) > 0) {
                            try {
                                String substring = str.substring(moz.x(str, ',', 0, 6) + 1);
                                substring.getClass();
                                byte[] decode = Base64.decode(substring, 0);
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inScaled = true;
                                options.inDensity = 160;
                                cynVar.e = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                            } catch (IllegalArgumentException e2) {
                                deu.b("data URL did not have correct base64 format.", e2);
                            }
                        }
                    }
                    Object obj3 = this.a;
                    Object obj4 = this.c;
                    if (cynVar.e == null && obj4 != null) {
                        try {
                            InputStream open = ((Context) obj3).getAssets().open(((String) obj4) + cynVar.d);
                            open.getClass();
                            try {
                                BitmapFactory.Options options2 = new BitmapFactory.Options();
                                options2.inScaled = true;
                                options2.inDensity = 160;
                                cynVar.e = dfb.c(BitmapFactory.decodeStream(open, null, options2), cynVar.a, cynVar.b);
                            } catch (IllegalArgumentException e3) {
                                deu.b("Unable to decode image.", e3);
                            }
                        } catch (IOException e4) {
                            deu.b("Unable to open asset.", e4);
                        }
                    }
                }
                return mlh.a;
            case 2:
                mjo.o(obj);
                return ((gym) ((hri) this.b).a).a("/v1/batchupdatethreadstate", (goa) this.a, this.c, lec.a);
            case 3:
                mjo.o(obj);
                return ((gym) ((hri) this.b).a).a("/v1/createusersubscription", (goa) this.a, this.c, lee.a);
            case 4:
                mjo.o(obj);
                return ((gym) ((hri) this.b).a).a("/v1/deleteusersubscription", (goa) this.a, this.c, leg.a);
            case 5:
                mjo.o(obj);
                return ((gym) ((hri) this.b).a).a("/v1/fetchlatestthreads", (goa) this.a, this.c, lei.e);
            case 6:
                mjo.o(obj);
                return ((gym) ((hri) this.b).a).a("/v1/fetchupdatedthreads", (goa) this.a, this.c, lek.d);
            case 7:
                mjo.o(obj);
                return ((gym) ((hri) this.b).a).a("/v1/removetarget", (goa) this.a, this.c, leq.a);
            case 8:
                mjo.o(obj);
                return ((gym) ((hri) this.b).a).a("/v1/setuserpreference", (goa) this.a, this.c, les.a);
            default:
                mjo.o(obj);
                return ((gym) ((hri) this.b).a).a("/v1/storetarget", (goa) this.a, this.c, leu.f);
        }
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        switch (this.d) {
            case 0:
                Object obj2 = this.a;
                return new gte((gtm) obj2, (lgp) this.b, (String) this.c, mmxVar, 0);
            case 1:
                Object obj3 = this.b;
                return new gte((cyb) obj3, (Context) this.a, (String) this.c, mmxVar, 1);
            case 2:
                Object obj4 = this.b;
                return new gte((hri) obj4, (goa) this.a, (leb) this.c, mmxVar, 2);
            case 3:
                Object obj5 = this.b;
                return new gte((hri) obj5, (goa) this.a, (led) this.c, mmxVar, 3);
            case 4:
                Object obj6 = this.b;
                return new gte((hri) obj6, (goa) this.a, (lef) this.c, mmxVar, 4);
            case 5:
                Object obj7 = this.b;
                return new gte((hri) obj7, (goa) this.a, (leh) this.c, mmxVar, 5);
            case 6:
                Object obj8 = this.b;
                return new gte((hri) obj8, (goa) this.a, (lej) this.c, mmxVar, 6);
            case 7:
                Object obj9 = this.b;
                return new gte((hri) obj9, (goa) this.a, (lep) this.c, mmxVar, 7);
            case 8:
                Object obj10 = this.b;
                return new gte((hri) obj10, (goa) this.a, (ler) this.c, mmxVar, 8);
            default:
                Object obj11 = this.b;
                return new gte((hri) obj11, (goa) this.a, (let) this.c, mmxVar, 9);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(gtm gtmVar, lgp lgpVar, String str, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.a = gtmVar;
        this.b = lgpVar;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(hri hriVar, goa goaVar, leb lebVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = hriVar;
        this.a = goaVar;
        this.c = lebVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(hri hriVar, goa goaVar, led ledVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = hriVar;
        this.a = goaVar;
        this.c = ledVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(hri hriVar, goa goaVar, lef lefVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = hriVar;
        this.a = goaVar;
        this.c = lefVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(hri hriVar, goa goaVar, leh lehVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = hriVar;
        this.a = goaVar;
        this.c = lehVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(hri hriVar, goa goaVar, lej lejVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = hriVar;
        this.a = goaVar;
        this.c = lejVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(hri hriVar, goa goaVar, lep lepVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = hriVar;
        this.a = goaVar;
        this.c = lepVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(hri hriVar, goa goaVar, ler lerVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = hriVar;
        this.a = goaVar;
        this.c = lerVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gte(hri hriVar, goa goaVar, let letVar, mmx mmxVar, int i) {
        super(2, mmxVar);
        this.d = i;
        this.b = hriVar;
        this.a = goaVar;
        this.c = letVar;
    }
}
