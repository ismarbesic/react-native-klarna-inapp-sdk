//
//  KlarnaSignInSDK.h
//  RNKlarnaMobileSDK
//
//  Created by Jorge Palacio on 2025-02-20.
//  Copyright © 2025 Facebook. All rights reserved.
//

#import <Foundation/Foundation.h>
#import <React/RCTBridgeModule.h>

NS_ASSUME_NONNULL_BEGIN

#ifdef RCT_NEW_ARCH_ENABLED
#import <RNKlarnaMobileSDK/RNKlarnaMobileSDK.h>
@interface KlarnaSignInManager: NSObject<NativeKlarnaSignInSpec>

#else

@interface KlarnaSignInManager: NSObject<RCTBridgeModule>

#endif

@end

NS_ASSUME_NONNULL_END
