#!/bin/bash
GREEN='\033[0;32m'
RED='\033[0;31m'
NC='\033[0m' # No Color
BOLD='\033[1m'

## Possible values for ENV are: windows, dev, qa, int
# Check folder serenity-configs for more options
if [ -z $1 ]; then
ENVIRONMENT='mac'
fi
printf "\n Creating configuration from files in ${BOLD} ./serenity-configs/ ${NC}\n"

python .build/run_tests --config-only --env $ENVIRONMENT

echo  "Note: if you want to generate for a different environment use parameters:"
echo  "For integration: ${BOLD} sh generate_properties.sh int${NC}"

echo  "All set, ${BOLD}now run the tests from eclipse or use this:${NC}"
echo  "${GREEN}.build/run_tests/run_tests.py --help${NC}"
