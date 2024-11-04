package j$.nio.file.attribute;

import java.nio.file.attribute.UserPrincipalLookupService;

/* loaded from: classes2.dex */
public final /* synthetic */ class O {
    public final /* synthetic */ UserPrincipalLookupService a;

    private O(UserPrincipalLookupService userPrincipalLookupService) {
        this.a = userPrincipalLookupService;
    }

    public static /* synthetic */ O a(UserPrincipalLookupService userPrincipalLookupService) {
        if (userPrincipalLookupService == null) {
            return null;
        }
        return new O(userPrincipalLookupService);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        UserPrincipalLookupService userPrincipalLookupService = this.a;
        if (obj instanceof O) {
            obj = ((O) obj).a;
        }
        return userPrincipalLookupService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
