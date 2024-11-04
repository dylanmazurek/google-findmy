package defpackage;

import android.os.Bundle;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ett implements jei {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ett(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        lnb lnbVar;
        boolean z = true;
        switch (this.b) {
            case 0:
                ((jni) ((jni) ((jni) etu.a.g()).i((igz) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "lambda$ensureFetchingDetails$5", 309, "SharingApplicationViewModel.java")).r("Unable to fetch sharing details since LSKF is not supported");
                etu etuVar = (etu) this.a;
                etuVar.d(lnb.SHARING_APPLICATION_FAILURE_LSKF_NOT_SUPPORTED);
                etuVar.c.i(ets.b());
                return null;
            case 1:
                ihb ihbVar = (ihb) obj;
                ((jni) ((jni) etu.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "lambda$ensureFetchingDetails$4", 297, "SharingApplicationViewModel.java")).r("Successfully fetched device details from sharing invitation");
                etu etuVar2 = (etu) this.a;
                etuVar2.d(lnb.SHARING_APPLICATION_FETCH_INVITATION_SUCCESS);
                etuVar2.c.i(ets.c(new etr(ihbVar.a, jis.o(ihbVar.b))));
                return null;
            case 2:
                ((jni) ((jni) ((jni) etu.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "lambda$ensureFetchingDetails$6", (char) 319, "SharingApplicationViewModel.java")).r("Failed to fetch device details from sharing invitation");
                etu etuVar3 = (etu) this.a;
                etuVar3.d(lnb.SHARING_APPLICATION_FAILURE);
                jdl jdlVar = jdl.a;
                etuVar3.c.i(new ets(2, jdlVar, jdlVar));
                return null;
            case 3:
                Void r14 = (Void) obj;
                ((jni) ((jni) etu.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "lambda$applyToShareDevice$0", 212, "SharingApplicationViewModel.java")).r("Successfully applied to share a device");
                etu etuVar4 = (etu) this.a;
                etuVar4.d(lnb.SHARING_APPLICATION_USER_APPLY_SUCCESS);
                jdl jdlVar2 = jdl.a;
                etuVar4.c.l(new ets(7, jdlVar2, jdlVar2));
                etuVar4.b.p();
                return r14;
            case 4:
                ((jni) ((jni) ((jni) etu.a.g()).i((igz) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "lambda$applyToShareDevice$2", 239, "SharingApplicationViewModel.java")).r("Unable to share since LSKF is not supported");
                etu etuVar5 = (etu) this.a;
                etuVar5.d(lnb.SHARING_APPLICATION_FAILURE_LSKF_NOT_SUPPORTED);
                etuVar5.c.i(ets.b());
                return null;
            case 5:
                Throwable th = (Throwable) obj;
                ((jni) ((jni) ((jni) etu.a.f()).i(th)).j("com/google/android/apps/adm/integrations/spot/sharing/application/SharingApplicationViewModel", "lambda$applyToShareDevice$3", (char) 249, "SharingApplicationViewModel.java")).r("Failed to apply to share a device");
                if (th instanceof ihc) {
                    lnbVar = lnb.SHARING_APPLICATION_GENERAL_KEYCHAIN_FAILURE;
                } else {
                    lnbVar = lnb.SHARING_APPLICATION_FAILURE;
                }
                etu etuVar6 = (etu) this.a;
                etuVar6.d(lnbVar);
                etuVar6.e();
                return null;
            case 6:
                ((jni) ((jni) etz.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "lambda$onApproveSharingApplication$0", 141, "SharingApplicationApprovalViewModel.java")).r("Successfully approved sharing application");
                etz etzVar = (etz) this.a;
                etzVar.d(lnb.SHARING_APPLICATION_APPROVAL_APPROVE_SUCCESS);
                etzVar.i.c(etzVar.d, jdl.a, jer.i(((lae) obj).a));
                etzVar.b.l(ety.APPROVED_SUCCESSFULLY);
                return null;
            case 7:
                ((jni) ((jni) ((jni) etz.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "lambda$onApproveSharingApplication$1", (char) 152, "SharingApplicationApprovalViewModel.java")).r("Failed to approve sharing application");
                etz etzVar2 = (etz) this.a;
                etzVar2.d(lnb.SHARING_APPLICATION_APPROVAL_APPROVE_FAILURE);
                etzVar2.b.i(ety.WAITING_FOR_USER_SELECTION);
                Bundle bundle = new Bundle();
                bundle.putString("SharingApplicationApprovalViewModelTryAgain", "FailedToApprove");
                exu a = evj.a();
                a.b = evc.a;
                etzVar2.j.l(R.string.sharing_application_approval_failure, bundle, a.e());
                etzVar2.g = null;
                return null;
            case 8:
                ((jni) ((jni) etz.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "lambda$ensureCalculationFutureInProgress$4", 252, "SharingApplicationApprovalViewModel.java")).r("Successfully calculated sharing validation code as inviter");
                etz etzVar3 = (etz) this.a;
                etzVar3.d(lnb.SHARING_APPLICATION_APPROVAL_CALCULATING_VALIDATION_CODE_SUCCESS);
                etzVar3.c.i(etd.b((String) obj));
                return null;
            case 9:
                ((jni) ((jni) ((jni) etz.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "lambda$ensureCalculationFutureInProgress$5", (char) 263, "SharingApplicationApprovalViewModel.java")).r("Failed calculating sharing validation code as inviter");
                etz etzVar4 = (etz) this.a;
                etzVar4.d(lnb.SHARING_APPLICATION_APPROVAL_CALCULATING_VALIDATION_CODE_FAILURE);
                etzVar4.c.i(etd.a());
                return null;
            case 10:
                lae laeVar = (lae) obj;
                ((jni) ((jni) etz.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "lambda$onDeclineSharingApplication$2", 187, "SharingApplicationApprovalViewModel.java")).r("Successfully declined sharing application");
                etz etzVar5 = (etz) this.a;
                etzVar5.d(lnb.SHARING_APPLICATION_APPROVAL_DECLINE_SUCCESS);
                lqd lqdVar = etzVar5.d;
                kyf kyfVar = laeVar.b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                etzVar5.i.b(lqdVar, kyfVar, laeVar.a);
                etzVar5.b.l(ety.DECLINED_SUCCESSFULLY);
                return null;
            case 11:
                ((jni) ((jni) ((jni) etz.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/applicationapproval/SharingApplicationApprovalViewModel", "lambda$onDeclineSharingApplication$3", (char) 199, "SharingApplicationApprovalViewModel.java")).r("Failed to decline sharing application");
                etz etzVar6 = (etz) this.a;
                etzVar6.d(lnb.SHARING_APPLICATION_APPROVAL_DECLINE_FAILURE);
                etzVar6.b.i(ety.WAITING_FOR_USER_SELECTION);
                Bundle bundle2 = new Bundle();
                bundle2.putString("SharingApplicationApprovalViewModelTryAgain", "FailedToDecline");
                exu a2 = evj.a();
                a2.b = evc.a;
                etzVar6.j.l(R.string.sharing_application_decline_failure, bundle2, a2.e());
                etzVar6.g = null;
                return null;
            case 12:
                ((jni) ((jni) eui.a.e()).j("com/google/android/apps/adm/integrations/spot/sharing/pending/PendingSharingApplicationInformationViewModel", "lambda$cancelSharing$0", 161, "PendingSharingApplicationInformationViewModel.java")).r("Successfully cancelled a pending sharing application");
                eui euiVar = (eui) this.a;
                euiVar.j.c(lnb.SHARING_PENDING_WITHDRAW_SUCCESS, jdl.a, euiVar.h);
                euiVar.b.k(euiVar.h);
                return null;
            case 13:
                ((jni) ((jni) ((jni) eui.a.f()).i((Throwable) obj)).j("com/google/android/apps/adm/integrations/spot/sharing/pending/PendingSharingApplicationInformationViewModel", "lambda$cancelSharing$1", (char) 173, "PendingSharingApplicationInformationViewModel.java")).r("Failed to cancel a pending sharing application");
                eui euiVar2 = (eui) this.a;
                euiVar2.j.c(lnb.SHARING_PENDING_WITHDRAW_FAILURE, jdl.a, euiVar2.h);
                euiVar2.f.l(false);
                Bundle bundle3 = new Bundle();
                bundle3.putString("PendingSharingApplicationInformationViewModelTryAgain", "FailedToCancel");
                exu a3 = evj.a();
                a3.b = evc.a;
                euiVar2.l.l(R.string.sharing_application_decline_failure, bundle3, a3.e());
                euiVar2.i = null;
                return null;
            case 14:
                ewr ewrVar = new ewr(null);
                Object obj2 = this.a;
                ewv ewvVar = (ewv) obj2;
                ewrVar.a = ewvVar.b(R.string.spot_nearby_finding_recommendation_card_title);
                ewrVar.c(ewvVar.b(R.string.spot_nearby_finding_recommendation_card_subtitle));
                ewrVar.b(R.drawable.gs_graphic_eq_vd_theme_24);
                ewrVar.d = new ecp(obj2, (lqd) obj, 13, null);
                ewrVar.e = 3;
                ewrVar.c = true;
                return ewrVar.a();
            case 15:
                ewr ewrVar2 = new ewr(null);
                Object obj3 = this.a;
                ewv ewvVar2 = (ewv) obj3;
                ewrVar2.a = ewvVar2.b(R.string.android_switch_account_suggestion_card_title);
                ewrVar2.c(ewvVar2.b.getString(R.string.android_switch_account_suggestion_card_subtitle, ewvVar2.c.unicodeWrap((String) obj)));
                ewrVar2.b(R.drawable.gs_swap_horiz_vd_theme_24);
                ewrVar2.d = new eub(obj3, 19);
                ewrVar2.e = 2;
                ewrVar2.c = false;
                return ewrVar2.a();
            case 16:
                kyf kyfVar2 = ((ewv) this.a).e.a((lqc) obj).b;
                if (kyfVar2 == null) {
                    return kyf.r;
                }
                return kyfVar2;
            case 17:
                lqd lqdVar2 = ((lqc) obj).d;
                if (lqdVar2 == null) {
                    lqdVar2 = lqd.d;
                }
                lqf b = lqf.b(lqdVar2.c);
                if (b == null) {
                    b = lqf.UNRECOGNIZED;
                }
                if (b != lqf.SUPERVISED_ANDROID_DEVICE || !((exa) this.a).i(3)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 18:
                exa exaVar = (exa) this.a;
                if (!eku.j((lqc) obj, exaVar.a) || !exaVar.e()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                exa exaVar2 = (exa) this.a;
                if (!eku.j((lqc) obj, exaVar2.a) || !exaVar2.g()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                exa exaVar3 = (exa) this.a;
                if (!eku.j((lqc) obj, exaVar3.a) || !exaVar3.f()) {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}
